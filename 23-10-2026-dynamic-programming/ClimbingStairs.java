import java.util.*;

// 70 Climbing Stairs | Time: O(n)  Space: O(1)
public class ClimbingStairs {
    public int climbStairs(int n) {
        int prev = 1, curr = 1;                 // ways to reach step 0 and step 1
        for (int i = 2; i <= n; i++) {
            int next = prev + curr;             // reach step i from step i-1 or step i-2
            prev = curr;
            curr = next;
        }
        return curr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of steps:");
        int n = Integer.parseInt(sc.nextLine().trim());
        System.out.println("Ways: " + new ClimbingStairs().climbStairs(n));
    }
}
