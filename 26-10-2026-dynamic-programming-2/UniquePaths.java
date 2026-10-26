import java.util.*;

// 62 Unique Paths | Time: O(m*n)  Space: O(n)
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);                      // first row: only one way to reach each cell
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] += dp[j - 1];              // ways from above + ways from the left
            }
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and cols:");
        String[] t = sc.nextLine().trim().split("\\s+");
        System.out.println("Paths: " + new UniquePaths().uniquePaths(Integer.parseInt(t[0]), Integer.parseInt(t[1])));
    }
}
