package com.mrstride;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Service;

@Service
public class ImageService {

    public BufferedImage getImage() throws IOException {
        // Relative path to the image file in resources folder
        URL imagePath = getClass().getClassLoader().getResource("images/temp.jpg");

        if (imagePath == null) {
            throw new IOException("Image file not found in resources");
        }

        // Load the image
        return ImageIO.read(imagePath);
    }
}
