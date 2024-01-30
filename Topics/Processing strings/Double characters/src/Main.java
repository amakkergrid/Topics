import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = str;
        String ans = "";
        for(int i=0;i<str.length();i++){
            ans = ans + str.charAt(i)+str.charAt(i);
        }
        System.out.println(ans);
    }
}
