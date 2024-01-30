import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Getting the input from the user
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        // Write your condition here using the ternary operator
        String result = (input%5==0)? ((input%3==0)?"FizzBuzz":"Fizz") :(input%3==0)?"Buzz": String.valueOf(input);/* Your code goes here */;

        System.out.println(result);
    }
}