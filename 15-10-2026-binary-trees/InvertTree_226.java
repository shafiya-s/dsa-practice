// 226 Invert Binary Tree
// Approach: recursion, swap children at every node
// Time: O(n)  Space: O(h)
public class InvertTree {
    public TreeNode invertTree(TreeNode r) {
        if (r == null) return null;
        TreeNode t = r.left;
        r.left = invertTree(r.right);
        r.right = invertTree(t);
        return r;
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.build(new Integer[]{4, 2, 7, 1, 3, 6, 9});
        System.out.println(TreeUtil.show(new InvertTree().invertTree(root)));
        // expected: [4, 7, 2, 9, 6, 3, 1]
    }
}