import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialValue = scanner.nextInt();
        int additionValue = scanner.nextInt();
        int multiplicationValue = scanner.nextInt();

        Calculator calculator = new Calculator(initialValue);
        calculator.add(additionValue);
        calculator.multiply(multiplicationValue);

        System.out.println(calculator.getValue());
        System.out.println(Calculator.showHistory());
    }
}

class Calculator {
    private int value;
    // TODO: Declare a static variable 'history'
    static int history;

    public Calculator(int value) {
        this.value = value;
        // TODO: Initialize 'history' if it has not been initialized
        history = 0;
    }

    // TODO: Implement the add() method
    public void add(int val){
        value+=val;
        history++;
    }
    // TODO: Implement the multiply() method
    public void multiply(int val){
        value*=val;
        history++;
    }
    // TODO: Implement the showHistory() static method
    public static int showHistory(){
        return history;
    }

    public int getValue() {
        return this.value;
    }
}