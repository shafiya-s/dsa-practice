import java.util.*;

// 235 Lowest Common Ancestor of a BST | Time: O(h)  Space: O(1)
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (p.val < root.val && q.val < root.val) {
                root = root.left;
            } else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            } else {
                return root;
            }
        }
        return null;
    }

    // finds the node with this value in a BST
    static TreeNode find(TreeNode root, int val) {
        while (root != null && root.val != val) {
            root = val < root.val ? root.left : root.right;
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter BST (level-order, 'null' for empty):");
        TreeNode root = TreeUtil.build(sc.nextLine());
        System.out.println("Enter value of p:");
        int pv = sc.nextInt();
        System.out.println("Enter value of q:");
        int qv = sc.nextInt();

        TreeNode p = find(root, pv);
        TreeNode q = find(root, qv);
        if (p == null || q == null) {
            System.out.println("p or q is not in the tree");
            return;
        }
        System.out.println("LCA: " + new LowestCommonAncestor().lowestCommonAncestor(root, p, q).val);
    }
}
