// 572 Subtree of Another Tree
// Approach: Same Tree check at every node
// Time: O(m*n)  Space: O(h)
public class SubtreeOfAnotherTree {
    boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public boolean isSubtree(TreeNode r, TreeNode s) {
        if (r == null) return false;
        return isSameTree(r, s) || isSubtree(r.left, s) || isSubtree(r.right, s);
    }

    public static void main(String[] args) {
        SubtreeOfAnotherTree x = new SubtreeOfAnotherTree();
        TreeNode big = TreeUtil.build(new Integer[]{3, 4, 5, 1, 2});
        TreeNode small1 = TreeUtil.build(new Integer[]{4, 1, 2});
        TreeNode small2 = TreeUtil.build(new Integer[]{4, 1});
        System.out.println(x.isSubtree(big, small1));   // expected: true
        System.out.println(x.isSubtree(big, small2));   // expected: false
    }
}