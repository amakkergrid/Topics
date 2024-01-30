// Import the required libraries
import java.util.Scanner;

// Main method
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animalType = scanner.nextLine();

        // Your code here
        Animal animal = null;
        if(animalType.equals("Dog")){
            animal = new Dog();
        }
        else{
            animal = new Cat();
        }
        animal.sound();

        scanner.close();
    }
}

// Create abstract Animal class
// Your code here
abstract class Animal{
    public abstract void sound();
}

// Create Dog class, subclass of Animal
// Your code here
class Dog extends Animal{
    public void sound(){
        System.out.println("Bark!");
    }
}


// Create Cat class, subclass of Animal
// Your code here
class Cat extends Animal{
    public void sound(){
        System.out.println("Meow!");
    }
}
