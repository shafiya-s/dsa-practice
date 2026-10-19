import java.util.*;

// 238 Product of Array Except Self | Time: O(n)  Space: O(1) extra (output not counted)
public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) res[i] = res[i - 1] * nums[i - 1];   // product of everything on the left
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;                                              // multiply by everything on the right
            right *= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (space separated):");
        int[] nums = readInts(sc.nextLine());
        System.out.println(Arrays.toString(new ProductExceptSelf().productExceptSelf(nums)));
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
