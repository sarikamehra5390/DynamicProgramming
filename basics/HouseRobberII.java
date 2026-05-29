package basics;

public class HouseRobberII {

    public static int maximumAdjacentElement(int[] nums) {
        int n = nums.length;

        if (n == 0) return 0;
        if (n == 1) return nums[0];

        int prev = nums[0];
        int prev2 = 0;

        for (int i = 1; i < n; i++) {
            int pick = nums[i];

            if (i > 1) {
                pick += prev2;
            }

            int nonPick = prev;
            int curi = Math.max(pick, nonPick);

            prev2 = prev;
            prev = curi;
        }

        return prev;
    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 2};
        int n = nums.length;

        if (n == 0) {
            System.out.println(0);
            return;
        }

        if (n == 1) {
            System.out.println(nums[0]);
            return;
        }

        int[] temp1 = new int[n - 1];
        int[] temp2 = new int[n - 1];

        for (int i = 1; i < n; i++) {
            temp1[i - 1] = nums[i];
        }

        for (int i = 0; i < n - 1; i++) {
            temp2[i] = nums[i];
        }

        System.out.println(
            Math.max(
                maximumAdjacentElement(temp1),
                maximumAdjacentElement(temp2)
            )
        );
    }
}