import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        
        int[] arr = new int[X];
        
        for(int i =0; i<X;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        for(int i = 0; i < X; i++){
            if(arr[i] < N){
                System.out.print(arr[i] + " ");
            }
        }
    }
}