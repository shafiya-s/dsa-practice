import java.util.*;

// 207 Course Schedule | Time: O(V + E)  Space: O(V + E)
public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) graph.add(new ArrayList<>());
        int[] indegree = new int[numCourses];
        for (int[] p : prerequisites) {
            graph.get(p[1]).add(p[0]);
            indegree[p[0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) if (indegree[i] == 0) q.add(i);
        int done = 0;
        while (!q.isEmpty()) {
            int course = q.poll();
            done++;
            for (int next : graph.get(course)) {
                if (--indegree[next] == 0) q.add(next);
            }
        }
        return done == numCourses;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of courses:");
        int n = Integer.parseInt(sc.nextLine().trim());
        System.out.println("Enter number of prerequisite pairs:");
        int m = Integer.parseInt(sc.nextLine().trim());
        int[][] pre = new int[m][2];
        System.out.println("Enter each pair as: course prerequisite");
        for (int i = 0; i < m; i++) {
            String[] t = sc.nextLine().trim().split("\\s+");
            pre[i][0] = Integer.parseInt(t[0]);
            pre[i][1] = Integer.parseInt(t[1]);
        }
        System.out.println("Can finish: " + new CourseSchedule().canFinish(n, pre));
    }
}
