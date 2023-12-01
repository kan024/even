import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.util.ArrayList;

public class NumberSorterTests {
	@Test
	public void testEven() {
        	ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 8, 11, 6));
		
        	int[] expected = new ArrayList<>(Arrays.asList(2, 8, 6));
		
		assertArrayEquals(expected, EvenSorter.Even(list));
	}
	@Test
	public void testEvenCount() {
        	ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 8, 11, 6));
		
        	int expected = 3;
		
		assertEquals(expected, EvenSorter.evenCount(list));
	}


}
