import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] arr = new int[s];
        for(int i=0;i<s;i++){
            arr[i] = sc.nextInt();
        }
        int n=sc.nextInt();
        int m=sc.nextInt();
        boolean flag = false;
        for(int i=0;i<s-1;i++){
            if((arr[i]==n&&arr[i+1]==m)||(arr[i]==m&&arr[i+1]==n)){
                flag = true;
                break;
            }
        }
        if(flag)System.out.println("true");
        else{
            System.out.println("false");
        }
    }
}