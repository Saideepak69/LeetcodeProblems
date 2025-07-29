class Solution:
    def decodeString(self, s: str) -> str:
        def func(s):
            stack = []
            for char in s:
                if char == ']':
                    word = ''
                    while stack and stack[-1] != '[':
                        word = stack.pop() + word
                    stack.pop()  # remove '['
                    num = ''
                    while stack and stack[-1].isdigit():
                        num = stack.pop() + num
                    stack.append(word * int(num))
                else:
                    stack.append(char)
            return ''.join(stack)
        return func(s)