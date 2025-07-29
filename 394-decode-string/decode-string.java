import java.util.Stack;

public class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        for (char charac : s.toCharArray()) {
            if (charac == ']') {
                StringBuilder word = new StringBuilder();
                while (!stack.isEmpty() && stack.peek() != '[') {
                    word.insert(0, stack.pop());
                }
                stack.pop();  // remove '['
                StringBuilder num = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    num.insert(0, stack.pop());
                }
                int repeatCount = Integer.parseInt(num.toString());
                for (int i = 0; i < repeatCount; i++) {
                    for (char c : word.toString().toCharArray()) {
                        stack.push(c);
                    }
                }
            } else {
                stack.push(charac);
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }
        return result.toString();
    }
}