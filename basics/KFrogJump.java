package basics;
import java.util.*;

public class KFrogJump {

    public static int kJumps(int n, int[] heights, int[] dp, int k){
        if(n == 0) return 0;
        
        if(dp[n] != -1) return dp[n];
        
        int minEnergy = Integer.MAX_VALUE;
        for(int j = 1 ; j <= k ; j++){
            if(n - j >= 0){
                int energy = kJumps(n - j, heights, dp, k) + Math.abs(heights[n] - heights[n - j]);
                minEnergy = Math.min(minEnergy, energy);
            }
        }
        dp[n] = minEnergy;
        return minEnergy;
    }


    public static void main(String[] args) {
        int[] heights = {30, 10, 60, 10, 60, 50};
        int n = heights.length;

        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        int k = 2;
        System.out.println(kJumps(n - 1, heights, dp, k));


    }
    
}
