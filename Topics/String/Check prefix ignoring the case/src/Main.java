import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String s = scanner.nextLine();
        boolean ans = s.startsWith("J") || s.startsWith("j");
        System.out.println(ans);
    }
}