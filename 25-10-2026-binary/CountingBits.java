import java.util.*;

// 338 Counting Bits | Time: O(n)  Space: O(n)
public class CountingBits {
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i >> 1] + (i & 1);   // bits of i/2, plus 1 if i is odd
        }
        return dp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = Integer.parseInt(sc.nextLine().trim());
        System.out.println(Arrays.toString(new CountingBits().countBits(n)));
    }
}
