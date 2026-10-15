// 100 Same Tree
// Approach: compare node by node
// Time: O(n)  Space: O(h)
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        SameTree s = new SameTree();
        TreeNode a = TreeUtil.build(new Integer[]{1, 2, 3});
        TreeNode b = TreeUtil.build(new Integer[]{1, 2, 3});
        TreeNode c = TreeUtil.build(new Integer[]{1, 2, 4});
        System.out.println(s.isSameTree(a, b));   // expected: true
        System.out.println(s.isSameTree(a, c));   // expected: false
    }
}