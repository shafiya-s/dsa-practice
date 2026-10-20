# Day 6: Arrays and Binary Search

Date: 2026-10-20

## Problems

| # | Problem | File | Approach | Time | Space |
|---|---------|------|----------|------|-------|
| 53 | Maximum Subarray | MaxSubarray.java | Kadane's algorithm: extend the run or start fresh | O(n) | O(1) |
| 152 | Maximum Product Subarray | MaxProductSubarray.java | Track both the max and the min product at each step | O(n) | O(1) |
| 153 | Find Minimum in Rotated Sorted Array | FindMinRotated.java | Binary search comparing mid with the right end | O(log n) | O(1) |
| 33 | Search in Rotated Sorted Array | SearchRotated.java | Binary search, decide which half is sorted | O(log n) | O(1) |

n = size of the input, h = height, V = vertices, E = edges, L = length of the word.

## Notes

- 53: starts from nums[0] so an all-negative array still works.
- 152: a negative number can turn the smallest product into the largest, so the min is tracked too.
- 153: if nums[mid] > nums[hi] the minimum is to the right of mid.
- 33: one half is always sorted, check whether the target lies in it.

## Run

```bash
javac *.java
java MaxSubarray
java MaxProductSubarray
java FindMinRotated
java SearchRotated
```
