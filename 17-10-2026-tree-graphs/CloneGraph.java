import java.util.*;

// 133 Clone Graph | Time: O(V + E)  Space: O(V)
public class CloneGraph {
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        return dfs(node, new HashMap<>());
    }

    private Node dfs(Node node, Map<Node, Node> copy) {
        if (copy.containsKey(node)) return copy.get(node);
        Node c = new Node(node.val);
        copy.put(node, c);
        for (Node nb : node.neighbors) c.neighbors.add(dfs(nb, copy));
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes (nodes are 1..n):");
        int n = Integer.parseInt(sc.nextLine().trim());
        Node[] nodes = new Node[n + 1];
        for (int i = 1; i <= n; i++) nodes[i] = new Node(i);
        System.out.println("For each node 1.." + n + ", enter its neighbours on one line (empty line if none):");
        for (int i = 1; i <= n; i++) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;
            for (String s : line.split("\\s+")) nodes[i].neighbors.add(nodes[Integer.parseInt(s)]);
        }
        Node copy = new CloneGraph().cloneGraph(n == 0 ? null : nodes[1]);
        Map<Integer, Node> seen = new TreeMap<>();
        collect(copy, seen);
        for (Map.Entry<Integer, Node> e : seen.entrySet()) {
            List<Integer> nb = new ArrayList<>();
            for (Node x : e.getValue().neighbors) nb.add(x.val);
            System.out.println(e.getKey() + " -> " + nb);
        }
        System.out.println("Clone is a different object: " + (copy != nodes[1]));
    }

    static void collect(Node node, Map<Integer, Node> seen) {
        if (node == null || seen.containsKey(node.val)) return;
        seen.put(node.val, node);
        for (Node nb : node.neighbors) collect(nb, seen);
    }
}
