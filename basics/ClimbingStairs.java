package basics;
import java.util.*;

public class ClimbingStairs {

    static int fibonacci(int n, int[] dp){

        if(n <= 1){
            return 1;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        return dp[n] = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        int prev = 1 ;
        int prev2 = 0;

        for(int i = 2 ; i < n ; i++){
            int curr = prev + prev2;

            prev2 = prev ;
            prev = curr;
        }
        
        System.out.println(fibonacci(n, dp));
    }
    
}
