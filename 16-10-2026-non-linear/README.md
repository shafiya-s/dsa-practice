# Day 2: Trees (Binary Tree, BST, Trie)

Date: 2026-10-16

## Problems

| # | Problem | File | Approach | Time | Space |
|---|---------|------|----------|------|-------|
| 124 | Binary Tree Maximum Path Sum | MaxPathSum.java | DFS, record the best bend at each node, return the better single side | O(n) | O(h) |
| 98 | Validate Binary Search Tree | ValidateBST.java | DFS with a (min, max) range for every node | O(n) | O(h) |
| 230 | Kth Smallest Element in a BST | KthSmallest.java | Iterative inorder with a stack, stop at the kth node | O(h + k) | O(h) |
| 235 | Lowest Common Ancestor of a BST | LowestCommonAncestor.java | Walk down from the root, go left or right until the paths split | O(h) | O(1) |
| 208 | Implement Trie (Prefix Tree) | Trie.java | Each node has 26 child slots and an end flag | O(L) per operation | O(total letters * 26) |

n = number of nodes, h = height of the tree, k = the kth smallest asked for, L = length of the word.

## Notes

- 124: a node returns the best sum going down one side only, but the best path bending at that node uses both sides. Negative sides are skipped with Math.max(0, ...).
- 98: comparing a node only with its parent is not enough, so each node gets a (min, max) range. Long bounds are used so Integer.MIN_VALUE and Integer.MAX_VALUE nodes still work.
- 230: inorder traversal of a BST gives sorted values, so the kth node visited is the answer.
- 235: if both values are smaller go left, if both are larger go right, otherwise the current node is the answer.
- 208: search needs the end flag to be true, startsWith only needs the path to exist.