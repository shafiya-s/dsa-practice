import java.util.*;

// 102 Level Order Traversal
// Approach: BFS with an array queue (head and tail)
// Time: O(n)  Space: O(n)
public class LevelOrderTraversal {
    int count(TreeNode n) {
        return n == null ? 0 : 1 + count(n.left) + count(n.right);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        TreeNode[] q = new TreeNode[count(root)];
        int head = 0, tail = 0;
        q[tail++] = root;
        while (head < tail) {
            int size = tail - head;
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode n = q[head++];
                level.add(n.val);
                if (n.left != null) q[tail++] = n.left;
                if (n.right != null) q[tail++] = n.right;
            }
            res.add(level);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.build(new Integer[]{3, 9, 20, null, null, 15, 7});
        System.out.println(new LevelOrderTraversal().levelOrder(root));
        // expected: [[3], [9, 20], [15, 7]]
    }
}