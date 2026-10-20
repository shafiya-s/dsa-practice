import java.util.*;

// 152 Maximum Product Subarray | Time: O(n)  Space: O(1)
public class MaxProductSubarray {
    public int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], best = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int x = nums[i];
            int a = max * x, b = min * x;          // a negative x can turn the smallest product into the biggest
            max = Math.max(x, Math.max(a, b));
            min = Math.min(x, Math.min(a, b));
            best = Math.max(best, max);
        }
        return best;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (space separated):");
        int[] nums = readInts(sc.nextLine());
        System.out.println("Max product: " + new MaxProductSubarray().maxProduct(nums));
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
