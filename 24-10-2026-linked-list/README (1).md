# Day 10: Linked List

Date: 2026-10-24

## Problems

| # | Problem | File | Approach | Time | Space |
|---|---------|------|----------|------|-------|
| 206 | Reverse Linked List | ReverseLinkedList.java | Iterative, flip each next pointer while walking | O(n) | O(1) |
| 141 | Linked List Cycle | LinkedListCycle.java | Fast and slow pointers (Floyd) | O(n) | O(1) |
| 21 | Merge Two Sorted Lists | MergeTwoSortedLists.java | Dummy head, always attach the smaller node | O(m + n) | O(1) |
| 19 | Remove Nth Node From End of List | RemoveNthFromEnd.java | Fast pointer n steps ahead, then move both | O(n) | O(1) |

n = size of the input, h = height, V = vertices, E = edges, L = length of the word.

## Notes

- 206: save next before overwriting it, or the rest of the list is lost.
- 141: if there is a cycle the fast pointer eventually catches the slow one.
- 21: a dummy head avoids special-casing the first node.
- 19: a dummy head also handles removing the first node.
- ListNode.java and ListUtil.java are shared by every program in this folder.
- For the cycle problem, the program takes pos (the index the tail connects to, -1 for none) as extra input.

## Run

```bash
javac *.java
java ReverseLinkedList
java LinkedListCycle
java MergeTwoSortedLists
java RemoveNthFromEnd
```
