package basics;
import java.util.*;

public class FrogJump {

    public static int frogJump(int n, int[] heights){
        int prev = 0;
        int prev2 = 0 ;

        for(int i = 1 ; i < n ; i++){
            int fs = prev + Math.abs(heights[i] - heights[i - 1]);
            int ss = Integer.MAX_VALUE;
            if(i > 1){
                 ss = prev2 + Math.abs(heights[i] - heights[i - 2]);
            }

            int curr = Math.min(fs, ss);
            prev2 = prev;
            prev = curr;
        }

        return prev;
    }
    public static void main(String[] args) {
        int[] heights = {30, 10, 60, 10, 60, 50};
        int n = heights.length;

        System.out.println(frogJump(n, heights));
    }
    
}
