# Day 9: Dynamic Programming

Date: 2026-10-23

## Problems

| # | Problem | File | Approach | Time | Space |
|---|---------|------|----------|------|-------|
| 70 | Climbing Stairs | ClimbingStairs.java | Each step = ways from the previous two steps (Fibonacci) | O(n) | O(1) |
| 198 | House Robber | HouseRobber.java | Track the best total if the last house was robbed or skipped | O(n) | O(1) |
| 213 | House Robber II | HouseRobberII.java | Houses in a circle: best of skipping the first or skipping the last | O(n) | O(1) |
| 322 | Coin Change | CoinChange.java | dp[a] = fewest coins for amount a, try every coin | O(amount * coins) | O(amount) |

n = size of the input, h = height, V = vertices, E = edges, L = length of the word.

## Notes

- 70: only the previous two values are needed, so two variables replace the array.
- 198: robbing a house means the previous one was skipped.
- 213: first and last houses are neighbours, so at most one of them is robbed.
- 322: amount + 1 is used as 'impossible' because no valid answer can be that large.

## Run

```bash
javac *.java
java ClimbingStairs
java HouseRobber
java HouseRobberII
java CoinChange
```
