import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EvenSorter {
    public static ArrayList<Integer> numbers;

    static EvenSorter(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    static List<Integer> Even() {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        return evenNumbers;
    }


    static int evenCount(){
        return numbers.size();
    }
}
    
