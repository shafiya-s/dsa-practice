import java.util.*;

// 208 Implement Trie (Prefix Tree) | Time: O(L) per operation  Space: O(total letters * 26)
public class Trie {
    private static class Node {
        Node[] next = new Node[26];
        boolean end;
    }

    private final Node root = new Node();

    public void insert(String word) {
        Node curr = root;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (curr.next[i] == null) curr.next[i] = new Node();
            curr = curr.next[i];
        }
        curr.end = true;
    }

    public boolean search(String word) {
        Node node = find(word);
        return node != null && node.end;
    }

    public boolean startsWith(String prefix) {
        return find(prefix) != null;
    }

    private Node find(String s) {
        Node curr = root;
        for (char c : s.toCharArray()) {
            curr = curr.next[c - 'a'];
            if (curr == null) return null;
        }
        return curr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Trie trie = new Trie();
        System.out.println("Commands: insert <word> | search <word> | startsWith <prefix> | exit");
        while (true) {
            System.out.print("> ");
            String line = sc.nextLine().trim();
            if (line.equals("exit")) break;
            String[] parts = line.split("\\s+");
            if (parts.length < 2) {
                System.out.println("Use: command word");
                continue;
            }
            String cmd = parts[0], word = parts[1].toLowerCase();
            if (cmd.equals("insert")) {
                trie.insert(word);
                System.out.println("inserted " + word);
            } else if (cmd.equals("search")) {
                System.out.println(trie.search(word));
            } else if (cmd.equals("startsWith")) {
                System.out.println(trie.startsWith(word));
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}