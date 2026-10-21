import java.util.*;

// 11 Container With Most Water | Time: O(n)  Space: O(1)
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, best = 0;
        while (i < j) {
            int area = Math.min(height[i], height[j]) * (j - i);
            best = Math.max(best, area);
            if (height[i] < height[j]) i++;   // the shorter wall limits the water, so move it
            else j--;
        }
        return best;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter heights (space separated):");
        int[] h = readInts(sc.nextLine());
        System.out.println("Max area: " + new ContainerWithMostWater().maxArea(h));
    }

    static int[] readInts(String line) {
        line = line.trim();
        if (line.isEmpty()) return new int[0];
        String[] t = line.split("\\s+");
        int[] a = new int[t.length];
        for (int i = 0; i < t.length; i++) a[i] = Integer.parseInt(t[i]);
        return a;
    }
}
