import java.util.*;

// 1 Two Sum | Time: O(n)  Space: O(n)
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();   // value -> index
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (seen.containsKey(need)) return new int[]{seen.get(need), i};
            seen.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (space separated):");
        int[] nums = readInts(sc.nextLine());
        System.out.println("Enter target:");
        int target = Integer.parseInt(sc.nextLine().trim());
        System.out.println(Arrays.toString(new TwoSum().twoSum(nums, target)));
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
