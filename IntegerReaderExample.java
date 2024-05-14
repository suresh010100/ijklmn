import java.util.Scanner;

class IntegerReader {
    private String inputLine;

    public IntegerReader(String inputLine) {
        this.inputLine = inputLine;
    }

    public void displayIntegers() {
        String[] numbers = inputLine.split(" ");
        System.out.println("Integers:");
        for (String number : numbers) {
            System.out.println(number);
        }
    }

    public void displaySum() {
        String[] numbers = inputLine.split(" ");
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        System.out.println("Sum of Integers: " + sum);
    }
}

public class IntegerReaderExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of integers separated by space: ");
        String inputLine = scanner.nextLine();

        IntegerReader reader = new IntegerReader(inputLine);
        reader.displayIntegers();
        reader.displaySum();

        scanner.close();
    }
}
