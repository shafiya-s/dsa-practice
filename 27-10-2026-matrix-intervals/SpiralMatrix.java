import java.util.*;

// 54 Spiral Matrix | Time: O(m*n)  Space: O(1) extra (output not counted)
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] a) {
        List<Integer> res = new ArrayList<>();
        int top = 0, bottom = a.length - 1, left = 0, right = a[0].length - 1;
        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) res.add(a[top][j]);          // left to right
            top++;
            for (int i = top; i <= bottom; i++) res.add(a[i][right]);        // top to bottom
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) res.add(a[bottom][j]);   // right to left
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) res.add(a[i][left]);     // bottom to top
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and cols:");
        String[] rc = sc.nextLine().trim().split("\\s+");
        int m = Integer.parseInt(rc[0]), n = Integer.parseInt(rc[1]);
        int[][] a = new int[m][n];
        System.out.println("Enter " + m + " rows of " + n + " numbers:");
        for (int i = 0; i < m; i++) {
            String[] t = sc.nextLine().trim().split("\\s+");
            for (int j = 0; j < n; j++) a[i][j] = Integer.parseInt(t[j]);
        }
        System.out.println(new SpiralMatrix().spiralOrder(a));
    }
}
