import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numsArr = new int[N];
        
        
        for(int i = 0; i < N; i++){
            numsArr[i] = sc.nextInt();
        }
        
        int V = sc.nextInt();
        int cnt = 0;
        
       for(int i = 0; i < numsArr.length; i++){
            if(numsArr[i] == V)
                cnt++;
        }
        System.out.println(cnt);
            
    }
    
}
