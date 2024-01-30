import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        // Your code here
        String[] str = sentence.split(" ");
        String ans="";
        int maxL = 0;
        for(int i=0;i<str.length;i++){
            if(str[i].length()>maxL){
                ans = str[i];
                maxL = str[i].length();
            }
        }
        System.out.println(ans);
    }
}