import java.util.*;

// 141 Linked List Cycle | Time: O(n)  Space: O(1)
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;            // tortoise moves 1 step
            fast = fast.next.next;       // hare moves 2 steps
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list (space separated):");
        ListNode head = ListUtil.build(sc.nextLine());
        System.out.println("Enter pos (index the tail connects to, -1 for no cycle):");
        int pos = Integer.parseInt(sc.nextLine().trim());
        if (head != null && pos >= 0) {
            ListNode tail = head, target = head;
            for (int i = 0; i < pos && target.next != null; i++) target = target.next;
            while (tail.next != null) tail = tail.next;
            tail.next = target;
        }
        System.out.println("Has cycle: " + new LinkedListCycle().hasCycle(head));
    }
}
