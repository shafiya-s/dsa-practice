# Day 7: Two Pointers and Strings

Date: 2026-10-21

## Problems

| # | Problem | File | Approach | Time | Space |
|---|---------|------|----------|------|-------|
| 125 | Valid Palindrome | ValidPalindrome.java | Two pointers, skip non-alphanumeric characters | O(n) | O(1) |
| 242 | Valid Anagram | ValidAnagram.java | 26 counters, add for one word and subtract for the other | O(n) | O(1) |
| 11 | Container With Most Water | ContainerWithMostWater.java | Two pointers, always move the shorter wall | O(n) | O(1) |
| 15 | 3Sum | ThreeSum.java | Sort, fix one number, two pointers for the rest, skip duplicates | O(n^2) | O(1) extra |

n = size of the input, h = height, V = vertices, E = edges, L = length of the word.

## Notes

- 125: compare in lower case and ignore symbols and spaces.
- 242: assumes lowercase letters, as in the problem.
- 11: moving the taller wall can never increase the area, so the shorter one moves.
- 15: sorting makes duplicates easy to skip and lets two pointers find the pair.

## Run

```bash
javac *.java
java ValidPalindrome
java ValidAnagram
java ContainerWithMostWater
java ThreeSum
```
