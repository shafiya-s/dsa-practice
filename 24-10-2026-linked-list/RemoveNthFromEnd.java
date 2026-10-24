import java.util.*;

// 19 Remove Nth Node From End of List | Time: O(n)  Space: O(1)
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;
        for (int i = 0; i < n; i++) fast = fast.next;      // fast starts n steps ahead
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;                         // slow is just before the node to remove
        return dummy.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list (space separated):");
        ListNode head = ListUtil.build(sc.nextLine());
        System.out.println("Enter n:");
        int n = Integer.parseInt(sc.nextLine().trim());
        System.out.println(ListUtil.show(new RemoveNthFromEnd().removeNthFromEnd(head, n)));
    }
}
