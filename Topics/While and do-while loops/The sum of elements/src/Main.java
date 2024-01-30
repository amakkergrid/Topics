import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while(scanner.hasNext()){
            int v = scanner.nextInt();
            if(v==0)break;
            sum+=v;

        }
        System.out.print(sum);
        // start coding here
    }
}