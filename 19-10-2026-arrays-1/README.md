# Day 5: Arrays

Date: 2026-10-19

## Problems

| # | Problem | File | Approach | Time | Space |
|---|---------|------|----------|------|-------|
| 1 | Two Sum | TwoSum.java | HashMap of value to index, look up the complement | O(n) | O(n) |
| 121 | Best Time to Buy and Sell Stock | BestTimeToBuySellStock.java | Track the cheapest price so far and the best profit | O(n) | O(1) |
| 217 | Contains Duplicate | ContainsDuplicate.java | HashSet, add returns false on a repeat | O(n) | O(n) |
| 238 | Product of Array Except Self | ProductExceptSelf.java | Left products in the output, then a running right product | O(n) | O(1) extra |

n = size of the input, h = height, V = vertices, E = edges, L = length of the word.

## Notes

- 1: one pass is enough because the complement of the current number is checked before it is stored.
- 121: sell today at the best profit against the cheapest earlier day.
- 217: Set.add tells me whether the value was already there.
- 238: no division, so zeros are handled correctly.

## Run

```bash
javac *.java
java TwoSum
java BestTimeToBuySellStock
java ContainsDuplicate
java ProductExceptSelf
```
