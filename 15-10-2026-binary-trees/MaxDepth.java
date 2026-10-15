// 104 Maximum Depth
// Approach: 1 + deeper side
// Time: O(n)  Space: O(h)
public class MaxDepth {
    public int maxDepth(TreeNode r) {
        if (r == null) return 0;
        int l = maxDepth(r.left);
        int g = maxDepth(r.right);
        return 1 + (l > g ? l : g);
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.build(new Integer[]{3, 9, 20, null, null, 15, 7});
        System.out.println(new MaxDepth().maxDepth(root));   // expected: 3
    }
}