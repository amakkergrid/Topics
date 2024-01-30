// Don't delete scanner import
import java.util.Scanner;

class Name {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    // use this program as a source of inspiration for your method

        String firstName1 = scanner.next();
        String lastName1 = scanner.next();

        String result = createFullName(firstName1,lastName1);

        System.out.println(result);
    }

    //implement your method here
    public static String createFullName(String a,String b){
        String result;
        result = a+" "+b;
        return result;
    }
}