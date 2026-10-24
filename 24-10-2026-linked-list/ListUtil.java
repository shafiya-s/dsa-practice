class ListUtil {

    // builds a linked list from a line like "1 2 3 4"
    static ListNode build(String line) {
        line = line.trim();
        if (line.isEmpty()) return null;
        String[] t = line.split("\\s+");
        ListNode dummy = new ListNode(0), tail = dummy;
        for (String s : t) {
            tail.next = new ListNode(Integer.parseInt(s));
            tail = tail.next;
        }
        return dummy.next;
    }

    // returns the list as text like [1, 2, 3]
    static String show(ListNode head) {
        StringBuilder sb = new StringBuilder("[");
        while (head != null) {
            sb.append(head.val);
            if (head.next != null) sb.append(", ");
            head = head.next;
        }
        return sb.append("]").toString();
    }
}
