package hackerrank.java.datastructures;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

    public class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            while (sc.hasNext()) {
                String input = sc.next();
                boolean balanced = isBalanced(input);
                System.out.println(balanced ? "true" : "false");
            }

            sc.close();
        }

        private static boolean isBalanced(String input) {
            Stack<Character> stack = new Stack<>();

            for (char c : input.toCharArray()) {
                if (c == '(')
                    stack.push(')');
                else if (c == '{')
                    stack.push('}');
                else if (c == '[')
                    stack.push(']');
                else {
                    if (stack.isEmpty() || c != stack.peek()) {
                        return false;
                    } else {
                        stack.pop();
                    }
                }
            }

            return stack.isEmpty();
        }
    }
}
