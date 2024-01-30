import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create an object of class Circle and print the area
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        double in = sc.nextDouble();
        c.radius = in;
        System.out.println(c.calculateArea());
    }
}

class Circle {
    double radius;

    // add instance method 'calculateArea' here
    public double calculateArea(){
        return Math.PI*this.radius*this.radius;
    }
}