import java.util.*;

// 371 Sum of Two Integers | Time: O(1) (at most 32 rounds)  Space: O(1)
public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;   // positions where both bits are 1 carry to the left
            a = a ^ b;                  // add without the carry
            b = carry;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = Integer.parseInt(sc.nextLine().trim());
        System.out.println("Enter b:");
        int b = Integer.parseInt(sc.nextLine().trim());
        System.out.println("Sum: " + new SumOfTwoIntegers().getSum(a, b));
    }
}
