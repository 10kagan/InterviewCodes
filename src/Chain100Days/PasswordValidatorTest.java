package Chain100Days;

import org.junit.Test;
import static org.junit.Assert.*;

public class PasswordValidatorTest {

    @Test
    public void shouldThrowExceptionWithCorrectMessage() {

        PasswordValidator validator = new PasswordValidator();

        try {
            validator.validate("abc123");
            fail("Expected IllegalStateException to be thrown");
        } catch (IllegalStateException e) {
            assertEquals(
                    "Password must be at least 8 characters long",
                    e.getMessage()
            );
        }
    }
}

// Test a method that throws an exception