import java.util.*;

// 53 Maximum Subarray | Time: O(n)  Space: O(1)
public class MaxSubarray {
    public int maxSubArray(int[] nums) {
        int curr = nums[0], best = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(nums[i], curr + nums[i]);   // extend the run or start fresh here
            best = Math.max(best, curr);
        }
        return best;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (space separated):");
        int[] nums = readInts(sc.nextLine());
        System.out.println("Max subarray sum: " + new MaxSubarray().maxSubArray(nums));
    }

    static int[] readInts(String line) {
        line = line.trim();
        if (line.isEmpty()) return new int[0];
        String[] t = line.split("\\s+");
        int[] a = new int[t.length];
        for (int i = 0; i < t.length; i++) a[i] = Integer.parseInt(t[i]);
        return a;
    }
}
