package com.mrstride;
import org.apache.logging.log4j.Logger;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class AppTest {
    @Test
    public void shouldAnswerTrue() {
        assertTrue(true);
    }
    @Test
    public void testEarnAnOscar() {
        // Arrange
        Logger mockLogger = mock(Logger.class); // Mock the correct Logger type
        Actor1 actor1 = new Actor1(); // Replace with your actual class name

        // Act
        boolean result = actor1.earnAnOscar(mockLogger);

        // Assert
        assertTrue(result); // Verifying the return value is true
        verify(mockLogger, times(1)).info("I earned an Oscar!"); // Verifying logger.info() was called once with the correct message
    }
}
