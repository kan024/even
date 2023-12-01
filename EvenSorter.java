import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EvenSorter {
    private ArrayList<Integer> numbers;

    public EvenSorter(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> Even() {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        return evenNumbers;
    }

    public List<Integer> Odd() {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }
        return oddNumbers;
    }
    public int evenCount(){
        return numbers.length();
    }
}
    
