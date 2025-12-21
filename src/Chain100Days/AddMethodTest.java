package Chain100Days;

import org.junit.Test;
import static org.junit.Assert.*;

public class AddMethodTest {

    private int add(int a, int b){
        return a + b;
    }

    @Test
    public void shouldAddTwoNumbers() {
        assertEquals(5, add(2, 3));
    }
}

// Write a JUnit test for a method that adds two numbers