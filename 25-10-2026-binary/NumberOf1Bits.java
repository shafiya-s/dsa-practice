import java.util.*;

// 191 Number of 1 Bits | Time: O(number of 1 bits)  Space: O(1)
public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1);   // removes the lowest 1 bit each time
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (0 to 4294967295):");
        long x = Long.parseLong(sc.nextLine().trim());
        System.out.println("1 bits: " + new NumberOf1Bits().hammingWeight((int) x));
    }
}
