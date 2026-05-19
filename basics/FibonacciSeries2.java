package basics;
import java.util.*;

public class FibonacciSeries2 {

    // This is the tabulation technique used in dp where the 
    //TC --> O(N)
    //SC --> O(1)

    static int f(int n, int[] dp){

        //base case
        if(n <= 1){
            return n;
        }
         
        // we are using memoization over here 
        if(dp[n] != -1){
            return dp[n];
        }

        return dp[n] = f(n - 1, dp) + f(n - 2, dp);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

         // Initializing the dp array
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        int prev = 1 ;
        int prev2 = 0;

        for(int i = 2 ; i < n ; i++){
            int curr = prev + prev2;

            prev2 = prev ;
            prev = curr;
        }
        
        System.out.println(f(n, dp));
       
        
    }
    
}
