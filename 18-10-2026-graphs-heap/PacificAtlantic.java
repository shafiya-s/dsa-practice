import java.util.*;

// 417 Pacific Atlantic Water Flow | Time: O(m*n)  Space: O(m*n)
public class PacificAtlantic {
    private static final int[][] DIRS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public List<List<Integer>> pacificAtlantic(int[][] h) {
        int m = h.length, n = h[0].length;
        boolean[][] pac = new boolean[m][n], atl = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            dfs(h, pac, i, 0);
            dfs(h, atl, i, n - 1);
        }
        for (int j = 0; j < n; j++) {
            dfs(h, pac, 0, j);
            dfs(h, atl, m - 1, j);
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (pac[i][j] && atl[i][j]) res.add(Arrays.asList(i, j));
        return res;
    }

    // walk uphill from the ocean edge
    private void dfs(int[][] h, boolean[][] seen, int r, int c) {
        seen[r][c] = true;
        for (int[] d : DIRS) {
            int nr = r + d[0], nc = c + d[1];
            if (nr < 0 || nc < 0 || nr >= h.length || nc >= h[0].length) continue;
            if (seen[nr][nc] || h[nr][nc] < h[r][c]) continue;
            dfs(h, seen, nr, nc);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and cols:");
        String[] rc = sc.nextLine().trim().split("\\s+");
        int m = Integer.parseInt(rc[0]), n = Integer.parseInt(rc[1]);
        int[][] h = new int[m][n];
        System.out.println("Enter " + m + " rows of " + n + " heights (space separated):");
        for (int i = 0; i < m; i++) {
            String[] t = sc.nextLine().trim().split("\\s+");
            for (int j = 0; j < n; j++) h[i][j] = Integer.parseInt(t[j]);
        }
        System.out.println(new PacificAtlantic().pacificAtlantic(h));
    }
}
