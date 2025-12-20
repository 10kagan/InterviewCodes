package Chain100Days;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class StringUtilParameterizedTest {

    private final String input;
    private final boolean expected;

    public StringUtilParameterizedTest(String input, boolean expected){
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: isOnlyDigits(\"{0}\") = {1}")
    public static Collection<Object []> data(){
        return Arrays.asList(new Object[][] {
                {"123", true},
                {"001", true},
                {"12a3", false},
                {"", false},
                {null, false},
                {" 123", false},
                {"123 ", false},
                {"-123", false}
        });
    }

    @Test
    public void shouldValidateOnlyDigits(){
        assertEquals(expected, StringUtil.isOnlyDigits(input));
    }
}

// Write parameterized tests in JUnit.