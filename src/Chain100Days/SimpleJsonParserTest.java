package Chain100Days;

import org.junit.Test;
import static org.junit.Assert.*;


public class SimpleJsonParserTest {
    @Test
    public void shouldParseNameFromJson(){
        SimpleJsonParser parser = new SimpleJsonParser();
        String name = parser.parseName("{\\\"name\\\":\\\"Alice\\\",\\\"age\\\":25}");

        assertEquals("Alice", name);

    }

    @Test
    public void shouldThrowForInvalidJson(){

        SimpleJsonParser parser = new SimpleJsonParser();

        try {
            parser.parseName("\"{\\\"age\\\":25}\"");
            fail("Expected exception");
        } catch (IllegalStateException e){
            assertEquals("Invalid JSON", e.getMessage());
        }
    }

}
