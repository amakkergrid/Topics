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
        int n = sc.nextInt();
        int sum = 0;
        for(int num:arr){
            if(num>n)sum+=num;
        }
        System.out.println(sum);
    }
}