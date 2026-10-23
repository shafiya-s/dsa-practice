import java.util.*;

// 213 House Robber II | Time: O(n)  Space: O(1)
public class HouseRobberII {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        // houses are in a circle: skip the first house, or skip the last house
        return Math.max(robLine(nums, 0, n - 2), robLine(nums, 1, n - 1));
    }

    private int robLine(int[] nums, int from, int to) {
        int skip = 0, take = 0;
        for (int i = from; i <= to; i++) {
            int newTake = skip + nums[i];
            skip = Math.max(skip, take);
            take = newTake;
        }
        return Math.max(skip, take);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter money in each house, in a circle (space separated):");
        int[] nums = readInts(sc.nextLine());
        System.out.println("Max money: " + new HouseRobberII().rob(nums));
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
