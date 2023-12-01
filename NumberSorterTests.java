import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.util.ArrayList;

public class NumberSorterTests {

    @Test
    public void evenCountTest() {
        // this method checks the number of even numbers in the array
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 8, 11, 6));
        NumberSorter numberSorter = new NumberSorter(list);
	int expected = numberSorter.Even().length();
	int result = numberSorter.evenCount();
	assertArrayEquals(expected, result);
    }
@Test
    public void evenArrayTest() {
        // this method checks the number of even numbers in the array
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 8, 11, 6));
        NumberSorter numberSorter = new NumberSorter(list);
	
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 8, 6));
	int result = numberSorter.Even();
	assertArrayEquals(expected, result);
 
}
}
