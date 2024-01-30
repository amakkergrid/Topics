import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int t = scanner.nextInt();
        int ans=0;
        while(t>0){
            int v = scanner.nextInt();
            if(v%4==0&&ans<v){
                ans = v;
            }
            t--;
        }
        System.out.println(ans);
    }
}