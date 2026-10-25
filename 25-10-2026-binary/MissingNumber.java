import java.util.*;

// 268 Missing Number | Time: O(n)  Space: O(1)
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int xor = nums.length;
        for (int i = 0; i < nums.length; i++) {
            xor ^= i ^ nums[i];      // every present number cancels with its index, leaving the missing one
        }
        return xor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers from 0..n with one missing (space separated):");
        int[] nums = readInts(sc.nextLine());
        System.out.println("Missing: " + new MissingNumber().missingNumber(nums));
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
