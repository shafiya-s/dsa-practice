import java.util.*;

// 3 Longest Substring Without Repeating Characters | Time: O(n)  Space: O(min(n, charset))
public class LongestSubstringNoRepeat {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> last = new HashMap<>();   // char -> last index seen
        int start = 0, best = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last.containsKey(c) && last.get(c) >= start) start = last.get(c) + 1;   // jump past the repeat
            last.put(c, i);
            best = Math.max(best, i - start + 1);
        }
        return best;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        System.out.println("Length: " + new LongestSubstringNoRepeat().lengthOfLongestSubstring(sc.nextLine()));
    }
}
