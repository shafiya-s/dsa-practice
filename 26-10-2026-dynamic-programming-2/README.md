# Day 12: Dynamic Programming

Date: 2026-10-26

## Problems

| # | Problem | File | Approach | Time | Space |
|---|---------|------|----------|------|-------|
| 62 | Unique Paths | UniquePaths.java | dp over the grid, ways from above plus ways from the left | O(m*n) | O(n) |
| 55 | Jump Game | JumpGame.java | Greedy, track the farthest index reachable | O(n) | O(1) |
| 91 | Decode Ways | DecodeWays.java | dp with the last two results, one digit or two digits | O(n) | O(1) |
| 300 | Longest Increasing Subsequence | LongestIncreasingSubsequence.java | Keep the smallest tail for each length, binary search | O(n log n) | O(n) |

n = size of the input.

## Notes

- 62: one row of dp is enough because each cell only needs the cell above (the old value) and the cell on its left.
- 55: if the current index is beyond the farthest reachable index, the end can't be reached.
- 91: a '0' can only be decoded as part of 10 or 20, so a lone '0' adds no ways.
- 300: the tails array is not the subsequence itself, only its length is the answer.

## Run

```bash
javac *.java
java UniquePaths
java JumpGame
java DecodeWays
java LongestIncreasingSubsequence
```
