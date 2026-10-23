import java.util.*;

// 198 House Robber | Time: O(n)  Space: O(1)
public class HouseRobber {
    public int rob(int[] nums) {
        int skip = 0, take = 0;                 // best total if the last house was skipped / robbed
        for (int x : nums) {
            int newTake = skip + x;
            skip = Math.max(skip, take);
            take = newTake;
        }
        return Math.max(skip, take);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter money in each house (space separated):");
        int[] nums = readInts(sc.nextLine());
        System.out.println("Max money: " + new HouseRobber().rob(nums));
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
