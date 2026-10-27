import java.util.*;

// 56 Merge Intervals | Time: O(n log n)  Space: O(n)
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (x, y) -> Integer.compare(x[0], y[0]));   // sort by start
        List<int[]> res = new ArrayList<>();
        for (int[] cur : intervals) {
            if (res.isEmpty() || res.get(res.size() - 1)[1] < cur[0]) {
                res.add(cur);                                            // no overlap, start a new interval
            } else {
                int[] last = res.get(res.size() - 1);
                last[1] = Math.max(last[1], cur[1]);                     // overlap, extend the end
            }
        }
        return res.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of intervals:");
        int n = Integer.parseInt(sc.nextLine().trim());
        int[][] in = new int[n][2];
        System.out.println("Enter each interval as: start end");
        for (int i = 0; i < n; i++) {
            String[] t = sc.nextLine().trim().split("\\s+");
            in[i][0] = Integer.parseInt(t[0]);
            in[i][1] = Integer.parseInt(t[1]);
        }
        System.out.println(Arrays.deepToString(new MergeIntervals().merge(in)));
    }
}
