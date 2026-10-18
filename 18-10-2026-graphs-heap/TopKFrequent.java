import java.util.*;

// 347 Top K Frequent Elements | Time: O(n)  Space: O(n)
public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int x : nums) count.put(x, count.getOrDefault(x, 0) + 1);

        // bucket[f] holds every number that appears exactly f times
        List<List<Integer>> bucket = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) bucket.add(new ArrayList<>());
        for (Map.Entry<Integer, Integer> e : count.entrySet()) bucket.get(e.getValue()).add(e.getKey());

        int[] res = new int[k];
        int idx = 0;
        for (int f = nums.length; f >= 1 && idx < k; f--) {
            for (int x : bucket.get(f)) {
                if (idx < k) res[idx++] = x;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (space separated):");
        String[] t = sc.nextLine().trim().split("\\s+");
        int[] nums = new int[t.length];
        for (int i = 0; i < t.length; i++) nums[i] = Integer.parseInt(t[i]);
        System.out.println("Enter k:");
        int k = Integer.parseInt(sc.nextLine().trim());
        System.out.println(Arrays.toString(new TopKFrequent().topKFrequent(nums, k)));
    }
}
