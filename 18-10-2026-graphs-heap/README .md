# Day 4: Graphs and Heap

Date: 2026-10-18

## Problems

| # | Problem | File | Approach | Time | Space |
|---|---------|------|----------|------|-------|
| 207 | Course Schedule | CourseSchedule.java | Topological sort with in-degrees (Kahn's BFS) | O(V + E) | O(V + E) |
| 417 | Pacific Atlantic Water Flow | PacificAtlantic.java | DFS uphill from each ocean's edge, keep cells reached by both | O(m*n) | O(m*n) |
| 128 | Longest Consecutive Sequence | LongestConsecutive.java | HashSet, only start counting at the beginning of a run | O(n) | O(n) |
| 347 | Top K Frequent Elements | TopKFrequent.java | Count with a HashMap, bucket sort by frequency | O(n) | O(n) |

n = size of the input, h = height, V = vertices, E = edges, L = length of the word.

## Notes

- 207: if the topological order covers every course there is no cycle.
- 417: searching from the oceans inward is cheaper than searching outward from every cell.
- 128: skipping numbers that have a smaller neighbour keeps it O(n).
- 347: bucket index = frequency, so no heap or sort is needed.

## Run

```bash
javac *.java
java CourseSchedule
java PacificAtlantic
java LongestConsecutive
java TopKFrequent
```
