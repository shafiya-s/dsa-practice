# Day 8: Strings and Sliding Window

Date: 2026-10-22

## Problems

| # | Problem | File | Approach | Time | Space |
|---|---------|------|----------|------|-------|
| 20 | Valid Parentheses | ValidParentheses.java | Stack of expected closing brackets | O(n) | O(n) |
| 49 | Group Anagrams | GroupAnagrams.java | HashMap keyed by the sorted letters of each word | O(n * k log k) | O(n * k) |
| 3 | Longest Substring Without Repeating Characters | LongestSubstringNoRepeat.java | Sliding window with the last index of each character | O(n) | O(min(n, charset)) |
| 424 | Longest Repeating Character Replacement | LongestRepeatingCharReplacement.java | Sliding window, shrink when replacements needed exceed k | O(n) | O(1) |

n = size of the input, h = height, V = vertices, E = edges, L = length of the word.

## Notes

- 20: pushing the closing bracket we expect makes the check a single comparison.
- 49: all anagrams sort to the same string, so it works as the group key.
- 3: on a repeat, the window start jumps just past the earlier copy.
- 424: window size minus the most common letter count is the number of replacements needed.

## Run

```bash
javac *.java
java ValidParentheses
java GroupAnagrams
java LongestSubstringNoRepeat
java LongestRepeatingCharReplacement
```
