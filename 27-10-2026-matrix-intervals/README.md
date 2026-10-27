# Day 13: Matrix and Intervals

Date: 2026-10-27

## Problems

| # | Problem | File | Approach | Time | Space |
|---|---------|------|----------|------|-------|
| 73 | Set Matrix Zeroes | SetMatrixZeroes.java | Use the first row and column as markers | O(m*n) | O(1) |
| 48 | Rotate Image | RotateImage.java | Transpose, then reverse every row | O(n^2) | O(1) |
| 54 | Spiral Matrix | SpiralMatrix.java | Four boundaries that shrink after each side | O(m*n) | O(1) extra |
| 56 | Merge Intervals | MergeIntervals.java | Sort by start, extend the last interval on overlap | O(n log n) | O(n) |

m, n = rows and columns of the matrix, n = number of intervals in 56.

## Notes

- 73: the first row and first column are checked separately before they are used as markers.
- 48: transpose swaps across the diagonal, and reversing each row turns that into a clockwise rotation.
- 54: the extra checks before the last two sides stop a single row or column from being added twice.
- 56: sorting by start means an overlap can only be with the last interval added.

## Run

```bash
javac *.java
java SetMatrixZeroes
java RotateImage
java SpiralMatrix
java MergeIntervals
```
