import java.util.*;

// 322 Coin Change | Time: O(amount * coins)  Space: O(amount)
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];          // dp[a] = fewest coins to make amount a
        Arrays.fill(dp, amount + 1);             // amount + 1 means "impossible"
        dp[0] = 0;
        for (int a = 1; a <= amount; a++) {
            for (int c : coins) {
                if (c <= a) dp[a] = Math.min(dp[a], dp[a - c] + 1);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coins (space separated):");
        int[] coins = readInts(sc.nextLine());
        System.out.println("Enter amount:");
        int amount = Integer.parseInt(sc.nextLine().trim());
        System.out.println("Fewest coins: " + new CoinChange().coinChange(coins, amount));
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
