import java.util.*;

// 48 Rotate Image | Time: O(n^2)  Space: O(1)
public class RotateImage {
    public void rotate(int[][] a) {
        int n = a.length;
        for (int i = 0; i < n; i++)                  // transpose: swap across the diagonal
            for (int j = i + 1; j < n; j++) {
                int t = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = t;
            }
        for (int[] row : a)                          // then reverse every row = 90 degrees clockwise
            for (int i = 0, j = n - 1; i < j; i++, j--) {
                int t = row[i];
                row[i] = row[j];
                row[j] = t;
            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n (matrix is n x n):");
        int n = Integer.parseInt(sc.nextLine().trim());
        int[][] a = new int[n][n];
        System.out.println("Enter " + n + " rows of " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            String[] t = sc.nextLine().trim().split("\\s+");
            for (int j = 0; j < n; j++) a[i][j] = Integer.parseInt(t[j]);
        }
        new RotateImage().rotate(a);
        System.out.println(Arrays.deepToString(a));
    }
}
