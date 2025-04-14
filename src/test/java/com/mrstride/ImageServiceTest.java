package com.mrstride;

import java.awt.image.BufferedImage;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ImageServiceTest {

    @Autowired
    private ImageService imageService;

    @Before
    public void setUp() {
        // Set up any necessary configuration or mocks if required
    }

    @Test
    public void testGetImage() throws IOException {
        // Call the service method
        BufferedImage image = imageService.getImage();

        // Assert that the image is not null
        Assert.assertNotNull("Image should not be null", image);

        // Optionally, check some properties of the image (e.g., width, height)
        Assert.assertTrue("Image width should be greater than 0", image.getWidth() > 0);
        Assert.assertTrue("Image height should be greater than 0", image.getHeight() > 0);
    }
}
 
