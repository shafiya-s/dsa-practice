import java.util.*;

// 211 Design Add and Search Words Data Structure | Time: O(L) add, O(26^dots * L) search worst  Space: O(total letters * 26)
public class AddSearchWord {
    private static class Node {
        Node[] next = new Node[26];
        boolean end;
    }

    private final Node root = new Node();

    public void addWord(String word) {
        Node curr = root;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (curr.next[i] == null) curr.next[i] = new Node();
            curr = curr.next[i];
        }
        curr.end = true;
    }

    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    private boolean dfs(String w, int i, Node node) {
        if (i == w.length()) return node.end;
        char c = w.charAt(i);
        if (c == '.') {
            for (Node child : node.next) {
                if (child != null && dfs(w, i + 1, child)) return true;
            }
            return false;
        }
        Node child = node.next[c - 'a'];
        return child != null && dfs(w, i + 1, child);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddSearchWord dict = new AddSearchWord();
        System.out.println("Commands: add <word> | search <word or pattern with .> | exit");
        while (true) {
            System.out.print("> ");
            String[] p = sc.nextLine().trim().split("\\s+");
            if (p[0].equals("exit")) break;
            if (p.length < 2) { System.out.println("Use: command word"); continue; }
            if (p[0].equals("add")) {
                dict.addWord(p[1].toLowerCase());
                System.out.println("added " + p[1]);
            } else if (p[0].equals("search")) {
                System.out.println(dict.search(p[1].toLowerCase()));
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
