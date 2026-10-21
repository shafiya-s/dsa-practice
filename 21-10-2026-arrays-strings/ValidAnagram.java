import java.util.*;

// 242 Valid Anagram | Time: O(n)  Space: O(1) (26 counters)
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int c : count) if (c != 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word (lowercase):");
        String s = sc.nextLine().trim();
        System.out.println("Enter second word (lowercase):");
        String t = sc.nextLine().trim();
        System.out.println(new ValidAnagram().isAnagram(s, t));
    }
}
