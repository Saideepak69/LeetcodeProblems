class Solution:
    def generateMatrix(self, n: int) -> List[List[int]]:
        mat = [[0] * n for _ in range(n)]
        top, down = 0, n-1
        left, right = 0, n-1
        inc = 1
        while top <= down and left <= right:
            for i in range(left, right+1):
                mat[top][i] = inc
                inc+=1
            top+=1
            for i in range(top, down+1):
                mat[i][right] = inc
                inc+=1
            right-=1
            if top <= down:
                for i in range(right, left-1, -1):
                    mat[down][i] = inc
                    inc+=1
                down-=1
            if left <= right:
                for i in range(down, top-1, -1):
                    mat[i][left] = inc
                    inc+=1
                left+=1
        return mat
