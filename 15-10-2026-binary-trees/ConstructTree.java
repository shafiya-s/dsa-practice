// 105 Construct Binary Tree from Preorder and Inorder
// Approach: next preorder item is root, find it in inorder, split, build left first
// Time: O(n^2) worst case  Space: O(h)
public class ConstructTree {
    int p;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        p = 0;
        return build(preorder, inorder, 0, inorder.length - 1);
    }

    TreeNode build(int[] pre, int[] in, int l, int r) {
        if (l > r) return null;
        int rootVal = pre[p++];
        TreeNode node = new TreeNode(rootVal);
        int m = l;
        while (in[m] != rootVal) m++;
        node.left = build(pre, in, l, m - 1);
        node.right = build(pre, in, m + 1, r);
        return node;
    }

    public static void main(String[] args) {
        int[] pre = {3, 9, 20, 15, 7};
        int[] in  = {9, 3, 15, 20, 7};
        System.out.println(TreeUtil.show(new ConstructTree().buildTree(pre, in)));
        // expected: [3, 9, 20, null, null, 15, 7]
    }
}