# Day 11: Bit Manipulation

Date: 2026-10-25

## Problems

| # | Problem | File | Approach | Time | Space |
|---|---------|------|----------|------|-------|
| 191 | Number of 1 Bits | NumberOf1Bits.java | n & (n - 1) removes the lowest set bit | O(number of 1 bits) | O(1) |
| 268 | Missing Number | MissingNumber.java | XOR of all indexes and values leaves the missing one | O(n) | O(1) |
| 338 | Counting Bits | CountingBits.java | dp[i] = dp[i >> 1] + (i & 1) | O(n) | O(n) |
| 371 | Sum of Two Integers | SumOfTwoIntegers.java | XOR adds without carry, AND shifted left is the carry | O(1) | O(1) |

n = size of the input, h = height, V = vertices, E = edges, L = length of the word.

## Notes

- 191: the input is read as a long so values up to 4294967295 are accepted, then cast to int.
- 268: x ^ x = 0, so everything present cancels out.
- 338: the bit count of i is the bit count of i / 2 plus its last bit.
- 371: repeat until there is no carry left.

## Run

```bash
javac *.java
java NumberOf1Bits
java MissingNumber
java CountingBits
java SumOfTwoIntegers
```
