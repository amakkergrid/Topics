import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here\
        int A=0,B=0,C=0,D=0;
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++)
        {
            String ch = scanner.next();
            if(ch.equals("A")){
                A++;
            }
            else if(ch.equals("B")){
                B++;
            }
            else if(ch.equals("C")){
                C++;
            }
            else {
                D++;
            }

        }
        System.out.println(D+" "+C+" "+B+" "+A);
    }
}