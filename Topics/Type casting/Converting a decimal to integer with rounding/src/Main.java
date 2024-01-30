import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create new Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Read the decimal number
        double decimalNumber = scanner.nextDouble();

        // Convert the decimal number to integer and print the result
        //.. your code here
        double rounded = Math.round(decimalNumber);
        int k = (int)rounded;
        System.out.print(k);

        scanner.close();
    }
}