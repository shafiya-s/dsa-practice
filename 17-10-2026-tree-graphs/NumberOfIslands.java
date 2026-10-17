import java.util.*;

// 200 Number of Islands | Time: O(m*n)  Space: O(m*n) recursion worst case
public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == '1') {
                    count++;
                    sink(grid, r, c);
                }
            }
        }
        return count;
    }

    private void sink(char[][] g, int r, int c) {
        if (r < 0 || c < 0 || r >= g.length || c >= g[0].length || g[r][c] != '1') return;
        g[r][c] = '0';
        sink(g, r + 1, c);
        sink(g, r - 1, c);
        sink(g, r, c + 1);
        sink(g, r, c - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and cols:");
        String[] rc = sc.nextLine().trim().split("\\s+");
        int rows = Integer.parseInt(rc[0]);
        char[][] grid = new char[rows][];
        System.out.println("Enter " + rows + " rows of 0 and 1 (no spaces, e.g. 11000):");
        for (int i = 0; i < rows; i++) grid[i] = sc.nextLine().trim().toCharArray();
        System.out.println("Islands: " + new NumberOfIslands().numIslands(grid));
    }
}
