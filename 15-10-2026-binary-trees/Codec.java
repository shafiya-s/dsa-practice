// 297 Serialize and Deserialize Binary Tree
// Approach: preorder with N for null and commas, read back with a pointer
// Time: O(n)  Space: O(n)
public class Codec {
    public String serialize(TreeNode root) {
        if (root == null) return "N,";
        return root.val + "," + serialize(root.left) + serialize(root.right);
    }

    int i;

    public TreeNode deserialize(String data) {
        i = 0;
        return build(data);
    }

    TreeNode build(String s) {
        if (s.charAt(i) == 'N') { i += 2; return null; }

        int sign = 1, num = 0;
        if (s.charAt(i) == '-') { sign = -1; i++; }

        while (s.charAt(i) != ',') {
            num = num * 10 + (s.charAt(i) - '0');
            i++;
        }
        i++;

        TreeNode node = new TreeNode(sign * num);
        node.left = build(s);
        node.right = build(s);
        return node;
    }

    public static void main(String[] args) {
        Codec c = new Codec();
        TreeNode root = TreeUtil.build(new Integer[]{1, 2, 3, null, null, 4, 5});
        String s = c.serialize(root);
        System.out.println(s);                                   // 1,2,N,N,3,4,N,N,5,N,N,
        System.out.println(TreeUtil.show(c.deserialize(s)));     // [1, 2, 3, null, null, 4, 5]
    }
}