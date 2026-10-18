import java.util.*;

// 128 Longest Consecutive Sequence | Time: O(n)  Space: O(n)
public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) set.add(x);
        int best = 0;
        for (int x : set) {
            if (set.contains(x - 1)) continue;   // only start counting from the beginning of a run
            int len = 1;
            while (set.contains(x + len)) len++;
            best = Math.max(best, len);
        }
        return best;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (space separated):");
        int[] nums = readInts(sc.nextLine());
        System.out.println("Longest consecutive: " + new LongestConsecutive().longestConsecutive(nums));
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
