import java.util.*;

// 124 Binary Tree Maximum Path Sum | Time: O(n)  Space: O(h)
public class MaxPathSum {
    int best;

    public int maxPathSum(TreeNode root) {
        best = Integer.MIN_VALUE;
        dfs(root);
        return best;
    }

    int dfs(TreeNode root) {
        if (root == null) return 0;
        int left = Math.max(0, dfs(root.left));
        int right = Math.max(0, dfs(root.right));
        best = Math.max(best, root.val + left + right);
        return root.val + Math.max(left, right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tree (level-order, 'null' for empty):");
        TreeNode root = TreeUtil.build(sc.nextLine());
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        System.out.println("Max path sum: " + new MaxPathSum().maxPathSum(root));
    }
}