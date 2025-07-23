class Solution:
    def maximumGain(self, s: str, x: int, y: int) -> int:
        cnt = 0
        stack = []

        for ch in s:
            if y > x:
                if stack and stack[-1] == 'b' and ch == 'a':
                    stack.pop()
                    cnt += y
                else:
                    stack.append(ch)
            else:
                if stack and stack[-1] == 'a' and ch == 'b':
                    stack.pop()
                    cnt += x
                else:
                    stack.append(ch)

        # Now handle the remaining second pattern
        s = ''.join(stack)
        stack = []

        for ch in s:
            if y > x:
                if stack and stack[-1] == 'a' and ch == 'b':
                    stack.pop()
                    cnt += x
                else:
                    stack.append(ch)
            else:
                if stack and stack[-1] == 'b' and ch == 'a':
                    stack.pop()
                    cnt += y
                else:
                    stack.append(ch)
        return cnt