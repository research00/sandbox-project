package com.mrstride;

import java.awt.image.BufferedImage;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyTempTest {

    @Autowired
    private MyTemp myTemp; // Injecting MyTemp

    @Autowired
    private ImageService imageService; // Injecting ImageService

    @BeforeEach
    void setup() {
        // You can add any setup logic here if needed.
    }

    @Test
    public void testLoadImage() {
        // Given: an instance of MyTemp is provided by Spring's context
        BufferedImage image = myTemp.loadImage();
        
        // Then: check if image is not null, meaning the image was successfully loaded
        assertNotNull(image, "The image should not be null");
    }
}
