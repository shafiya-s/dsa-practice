import java.util.*;

// 424 Longest Repeating Character Replacement | Time: O(n)  Space: O(1) (26 counters)
public class LongestRepeatingCharReplacement {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0, maxFreq = 0, best = 0;
        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, count[s.charAt(right) - 'A']);
            // window size minus the most common letter = replacements needed
            while ((right - left + 1) - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            best = Math.max(best, right - left + 1);
        }
        return best;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string (uppercase letters):");
        String s = sc.nextLine().trim();
        System.out.println("Enter k:");
        int k = Integer.parseInt(sc.nextLine().trim());
        System.out.println("Length: " + new LongestRepeatingCharReplacement().characterReplacement(s, k));
    }
}
