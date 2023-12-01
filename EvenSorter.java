import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EvenSorter {
    // returns a list of all even numbers in numbers
    static List<Integer> Even(List<Integer> numbers) {
        List<Integer> file = new ArrayList<>();
        
        for (int num : numbers) {
            if (num % 2 == 0) {
                file.add(num);
            }
        }
        return file;
    }

// returns how many even numbers there are in numbersList
    static int evenCount(List<Integer> numbersList){
        return numbersList.size();
    }
}
    
