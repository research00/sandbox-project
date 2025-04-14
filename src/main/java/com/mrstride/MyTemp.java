package com.mrstride;

import java.awt.image.BufferedImage;
import java.io.IOException;

import org.springframework.stereotype.Component;

@Component
public class MyTemp {

    private final ImageService imageService; // The ImageService dependency

    public MyTemp(ImageService imageService) {
        this.imageService = imageService; // Constructor-based injection
    }

    public BufferedImage loadImage() {
        try {
            return imageService.getImage(); // This might throw an IOException
        } catch (IOException e) {
            e.printStackTrace(); // Log the exception (you could also log it properly instead of just printing)
            return null; // Return null or handle as needed
        }
    }
}
