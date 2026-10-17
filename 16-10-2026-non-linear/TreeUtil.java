import java.util.*;

class TreeUtil {

    // builds a tree from a level-order line, e.g. "3 9 20 null null 15 7"
    static TreeNode build(String line) {
        String[] t = line.trim().split("\\s+");
        if (t[0].isEmpty() || t[0].equals("null")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(t[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (!q.isEmpty() && i < t.length) {
            TreeNode n = q.poll();
            if (i < t.length && !t[i].equals("null")) {
                n.left = new TreeNode(Integer.parseInt(t[i]));
                q.add(n.left);
            }
            i++;
            if (i < t.length && !t[i].equals("null")) {
                n.right = new TreeNode(Integer.parseInt(t[i]));
                q.add(n.right);
            }
            i++;
        }
        return root;
    }

    // returns the tree as a level-order string, like LeetCode shows it
    static String show(TreeNode root) {
        List<String> out = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode n = q.poll();
            if (n == null) {
                out.add("null");
                continue;
            }
            out.add(String.valueOf(n.val));
            q.add(n.left);
            q.add(n.right);
        }
        while (!out.isEmpty() && out.get(out.size() - 1).equals("null"))
            out.remove(out.size() - 1);
        return out.toString();
    }
}