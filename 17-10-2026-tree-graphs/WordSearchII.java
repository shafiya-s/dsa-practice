import java.util.*;

// 212 Word Search II | Time: O(m*n*4^L) worst, pruned by the trie  Space: O(total letters in words)
public class WordSearchII {
    private static class Node {
        Node[] next = new Node[26];
        String word;
    }

    public List<String> findWords(char[][] board, String[] words) {
        Node root = new Node();
        for (String w : words) {
            Node curr = root;
            for (char c : w.toCharArray()) {
                int i = c - 'a';
                if (curr.next[i] == null) curr.next[i] = new Node();
                curr = curr.next[i];
            }
            curr.word = w;
        }
        List<String> res = new ArrayList<>();
        for (int r = 0; r < board.length; r++)
            for (int c = 0; c < board[0].length; c++)
                dfs(board, r, c, root, res);
        return res;
    }

    private void dfs(char[][] b, int r, int c, Node parent, List<String> res) {
        char ch = b[r][c];
        if (ch == '#') return;
        Node node = parent.next[ch - 'a'];
        if (node == null) return;
        if (node.word != null) {
            res.add(node.word);
            node.word = null;
        }
        b[r][c] = '#';
        if (r > 0) dfs(b, r - 1, c, node, res);
        if (r < b.length - 1) dfs(b, r + 1, c, node, res);
        if (c > 0) dfs(b, r, c - 1, node, res);
        if (c < b[0].length - 1) dfs(b, r, c + 1, node, res);
        b[r][c] = ch;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and cols:");
        String[] rc = sc.nextLine().trim().split("\\s+");
        int rows = Integer.parseInt(rc[0]);
        char[][] board = new char[rows][];
        System.out.println("Enter " + rows + " rows of letters (no spaces, e.g. oaan):");
        for (int i = 0; i < rows; i++) board[i] = sc.nextLine().trim().toCharArray();
        System.out.println("Enter words (space separated):");
        String[] words = sc.nextLine().trim().split("\\s+");
        System.out.println(new WordSearchII().findWords(board, words));
    }
}
