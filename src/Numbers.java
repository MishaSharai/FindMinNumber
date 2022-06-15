import java.util.*;

public class Numbers {

    protected List<Integer> generateListNumbers(int size) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        while (size != 0) {
            numbers.add(random.nextInt(100));
            size--;
        }
        return numbers;
    }

    protected int findMin(List<Integer> numbers) {
        return Collections.min(numbers);
    }
}
