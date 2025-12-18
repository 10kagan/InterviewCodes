package Chain100Days;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.FileWriter;
import java.io.IOException;

public class FileLineReaderTest {

    @Test
    public void shouldReadFirstLineFromFile()throws IOException{

        String filePath = "test-data.txt";
        FileWriter writer = new FileWriter(filePath);
        writer.write("Hello World\nSecond line");
        writer.close();

        FileLineReader reader = new FileLineReader();
        String result = reader.readFirstLine(filePath);

        assertEquals("Hello World", result);
    }

    @Test
    public void shouldThrowExceptionWhenFileDoesNotExist() throws IOException{

        FileLineReader reader = new FileLineReader();
        reader.readFirstLine("non-existing-file.txt");
    }
}
