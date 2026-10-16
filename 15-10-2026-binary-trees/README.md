# Day 1: Binary Trees

Date: 2026-10-15

## Problems

| # | Problem | File | Approach | Time | Space |
|---|---------|------|----------|------|-------|
| 226 | Invert Binary Tree | InvertTree.java | Recursion, swap left and right | O(n) | O(h) |
| 104 | Maximum Depth | MaxDepth.java | 1 + deeper side | O(n) | O(h) |
| 100 | Same Tree | SameTree.java | Compare node by node | O(n) | O(h) |
| 572 | Subtree of Another Tree | SubtreeOfAnotherTree.java | Same Tree check at every node | O(m*n) | O(h) |
| 102 | Level Order Traversal | LevelOrderTraversal.java | BFS with an array queue | O(n) | O(n) |
| 105 | Construct Tree from Preorder and Inorder | ConstructTree.java | First preorder item is the root, find it in inorder, split | O(n^2) | O(h) |
| 297 | Serialize and Deserialize | Codec.java | Preorder with N for null values | O(n) | O(n) |

n = number of nodes, h = height of the tree, m = size of the small tree in 572.

