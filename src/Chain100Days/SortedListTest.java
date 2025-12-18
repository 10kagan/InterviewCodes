package Chain100Days;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class SortedListTest {

    @Test
    public void shouldVerifyListIsSortedAscending(){

        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);

        for (int i = 0; i < numbers.size() - 1; i++){
            assertTrue(
                    "List is not sorted at index" + 1,
                    numbers.get(i) <= numbers.get(i + 1)
            );
        }
    }
}

// Write a test to verify a list is sorted