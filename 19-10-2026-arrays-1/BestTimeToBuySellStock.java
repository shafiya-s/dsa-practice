import java.util.*;

// 121 Best Time to Buy and Sell Stock | Time: O(n)  Space: O(1)
public class BestTimeToBuySellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        for (int p : prices) {
            minPrice = Math.min(minPrice, p);            // cheapest day so far
            profit = Math.max(profit, p - minPrice);     // best if I sell today
        }
        return profit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter prices (space separated):");
        int[] prices = readInts(sc.nextLine());
        System.out.println("Max profit: " + new BestTimeToBuySellStock().maxProfit(prices));
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
