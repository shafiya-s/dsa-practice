# Day 3: Tries and Graphs

Date: 2026-10-17

## Problems

| # | Problem | File | Approach | Time | Space |
|---|---------|------|----------|------|-------|
| 211 | Design Add and Search Words | AddSearchWord.java | Trie, DFS on the pattern, a dot tries every child | O(L) add, up to O(26^dots * L) search | O(total letters * 26) |
| 212 | Word Search II | WordSearchII.java | Trie of all words, one DFS over the board that follows the trie | O(m*n*4^L) worst, pruned by the trie | O(total letters in words) |
| 200 | Number of Islands | NumberOfIslands.java | DFS flood fill, sink every land cell once | O(m*n) | O(m*n) recursion worst case |
| 133 | Clone Graph | CloneGraph.java | DFS with a HashMap from old node to its copy | O(V + E) | O(V) |

n = size of the input, h = height, V = vertices, E = edges, L = length of the word.

## Notes

- 211: a '.' in the pattern means try every child at that level.
- 212: the trie lets one DFS search for all words at once, and a found word is set to null so it is added only once.
- 200: marking visited land as water avoids a separate visited array.
- 133: the map stops infinite loops in cyclic graphs, and Node.java is the shared node class for this folder.
- Node.java is shared by CloneGraph.java only.

## Run

```bash
javac *.java
java AddSearchWord
java WordSearchII
java NumberOfIslands
java CloneGraph
```
