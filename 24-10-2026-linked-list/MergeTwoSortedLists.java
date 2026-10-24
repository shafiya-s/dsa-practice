import java.util.*;

// 21 Merge Two Sorted Lists | Time: O(m + n)  Space: O(1)
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0), tail = dummy;
        while (a != null && b != null) {
            if (a.val <= b.val) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        tail.next = (a != null) ? a : b;   // attach whatever is left
        return dummy.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first sorted list:");
        ListNode a = ListUtil.build(sc.nextLine());
        System.out.println("Enter second sorted list:");
        ListNode b = ListUtil.build(sc.nextLine());
        System.out.println(ListUtil.show(new MergeTwoSortedLists().mergeTwoLists(a, b)));
    }
}
