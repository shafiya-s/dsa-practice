import java.util.*;

// 206 Reverse Linked List | Time: O(n)  Space: O(1)
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;   // remember the rest of the list
            curr.next = prev;            // point this node backwards
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list (space separated, empty for none):");
        ListNode head = ListUtil.build(sc.nextLine());
        System.out.println(ListUtil.show(new ReverseLinkedList().reverseList(head)));
    }
}
