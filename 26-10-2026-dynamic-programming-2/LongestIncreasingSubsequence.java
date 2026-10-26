import java.util.*;

// 300 Longest Increasing Subsequence | Time: O(n log n)  Space: O(n)
public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int[] tails = new int[nums.length];   // tails[i] = smallest tail of an increasing run of length i + 1
        int size = 0;
        for (int x : nums) {
            int lo = 0, hi = size;
            while (lo < hi) {                  // first position whose tail is >= x
                int mid = lo + (hi - lo) / 2;
                if (tails[mid] < x) lo = mid + 1;
                else hi = mid;
            }
            tails[lo] = x;
            if (lo == size) size++;
        }
        return size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (space separated):");
        System.out.println("LIS length: " + new LongestIncreasingSubsequence().lengthOfLIS(readInts(sc.nextLine())));
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
