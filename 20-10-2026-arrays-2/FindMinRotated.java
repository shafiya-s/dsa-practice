import java.util.*;

// 153 Find Minimum in Rotated Sorted Array | Time: O(log n)  Space: O(1)
public class FindMinRotated {
    public int findMin(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > nums[hi]) lo = mid + 1;   // minimum is on the right of mid
            else hi = mid;                             // mid could be the minimum
        }
        return nums[lo];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rotated sorted numbers (unique, space separated):");
        int[] nums = readInts(sc.nextLine());
        System.out.println("Minimum: " + new FindMinRotated().findMin(nums));
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
