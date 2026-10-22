import java.util.*;

// 49 Group Anagrams | Time: O(n * k log k)  Space: O(n * k)
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);              // anagrams share the same sorted letters
            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(groups.values());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter words (space separated):");
        String[] words = sc.nextLine().trim().split("\\s+");
        System.out.println(new GroupAnagrams().groupAnagrams(words));
    }
}
