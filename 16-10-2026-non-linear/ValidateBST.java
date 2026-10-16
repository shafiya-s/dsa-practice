import java.util.*;

// 98 Validate Binary Search Tree | Time: O(n)  Space: O(h)
public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    boolean dfs(TreeNode root, long min, long max) {
        if (root == null) return true;
        if (root.val <= min || root.val >= max) return false;
        return dfs(root.left, min, root.val)
            && dfs(root.right, root.val, max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tree (level-order, 'null' for empty):");
        TreeNode root = TreeUtil.build(sc.nextLine());
        System.out.println("Valid BST: " + new ValidateBST().isValidBST(root));
    }
}