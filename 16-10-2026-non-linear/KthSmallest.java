import java.util.*;

// 230 Kth Smallest Element in a BST | Time: O(h + k)  Space: O(h)
public class KthSmallest {
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            k--;
            if (k == 0) return curr.val;
            curr = curr.right;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter BST (level-order, 'null' for empty):");
        TreeNode root = TreeUtil.build(sc.nextLine());
        System.out.println("Enter k:");
        int k = sc.nextInt();
        System.out.println("Kth smallest: " + new KthSmallest().kthSmallest(root, k));
    }
}