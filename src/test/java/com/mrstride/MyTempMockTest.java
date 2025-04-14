package com.mrstride;

import java.awt.image.BufferedImage;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

public class MyTempMockTest {

    @Mock
    private ImageService imageService; // Mocking the ImageService

    private MyTemp myTemp;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this); // Initialize the mocks
        myTemp = new MyTemp(imageService); // Injecting the mocked ImageService into MyTemp
    }

    @Test
    public void testLoadImageWithMock() throws IOException {  // Declare IOException here
        // Given: We want to mock the behavior of imageService.getImage()
        BufferedImage mockImage = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB); // Creating a mock image
        when(imageService.getImage()).thenReturn(mockImage); // Mocking the method to return the mock image
        
        // When: loadImage is called on MyTemp
        BufferedImage image = myTemp.loadImage();
        
        // Then: check that the mocked image is returned
        assertNotNull(image, "The image should not be null");
        assertEquals(mockImage, image, "The loaded image should be the mocked one");
    }
}
