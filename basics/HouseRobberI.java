package basics;
import java.util.*;

public class HouseRobberI { 
    public static void main(String[] args) {
        
    
    int[] nums = {1,2,3,1};
    int n = nums.length;

        int prev = nums[0];
        int prev2 = 0;

        for (int i = 1; i < n; i++) {
            int pick = nums[i];

            if (i > 1) {
                pick += prev2;
            }

            int notPick = prev;
            int curi = Math.max(pick, notPick);

            prev2 = prev;
            prev = curi;
        }

        System.out.println(prev);

    }

 }

    

