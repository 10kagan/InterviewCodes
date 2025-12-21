package Chain100Days;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class StringEqualityTest {

    @Test
    public void shouldVerifyStringContentEquality(){
        String expected = "Hello";
        String actual = new String("Hello");

        assertEquals(expected, actual);
    }
}

// Use Assert methods to test string equality