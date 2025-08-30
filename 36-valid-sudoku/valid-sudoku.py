class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        n=len(board)
        m=len(board[0])
        for i in range(n):
            for j in range(m):
                start = board[i][j]
                k = 0
                l = i
                while k < m:
                    if board[l][k] == start and k != j and start != ".":
                        return False
                    k += 1
                k = 0
                l = j
                while k < n:
                    if board[k][l] == start and k != i and start != ".":
                        return False
                    k += 1
                k = (i // 3) * 3
                l = (j // 3) * 3
                for p in range(k, k + 3):
                    for q in range(l, l + 3):
                        if board[p][q] == start and (p != i or q != j) and start != ".":
                            return False
        return True