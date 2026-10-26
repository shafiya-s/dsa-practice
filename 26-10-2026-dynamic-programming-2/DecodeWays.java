import java.util.*;

// 91 Decode Ways | Time: O(n)  Space: O(1)
public class DecodeWays {
    public int numDecodings(String s) {
        if (s.isEmpty() || s.charAt(0) == '0') return 0;
        int prev2 = 1, prev1 = 1;                            // ways for the string up to 2 and 1 characters back
        for (int i = 1; i < s.length(); i++) {
            int curr = 0;
            if (s.charAt(i) != '0') curr += prev1;           // decode this digit alone (1 to 9)
            int two = (s.charAt(i - 1) - '0') * 10 + (s.charAt(i) - '0');
            if (two >= 10 && two <= 26) curr += prev2;       // decode the last two digits together
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digits:");
        System.out.println("Ways: " + new DecodeWays().numDecodings(sc.nextLine().trim()));
    }
}
