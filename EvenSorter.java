import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EvenSorter {
    // returns a list of all even numbers in numbers
    static List<Integer> Even(List<Integer> numbers) {
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        return evenNumbers;
    }

// returns how many even numbers there are in numbersList
    static int evenCount(List<Integer> numbersList){
        return numbersList.size();
    }
}
    
