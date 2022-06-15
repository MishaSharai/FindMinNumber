import java.util.List;

public class Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        List<Integer> listNumbers = numbers.generateListNumbers(10);
        System.out.println("Numbers: " + listNumbers);
        System.out.println("Min numbers: " + numbers.findMin(listNumbers));
    }
}
