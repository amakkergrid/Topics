import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        if(n>s.length()){System.out.println(s);return;}
        String ans="";
        for(int i=n;i<s.length();i++)
        {
            ans = ans + s.charAt(i);
        }
        for(int i=0;i<n;i++)
        {
            ans = ans + s.charAt(i);
        }
        System.out.println(ans);


    }
}