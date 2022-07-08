import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println(IsValidParentheses("()"));
        System.out.println(IsValidParentheses("((()))"));
        System.out.println(IsValidParentheses("()()()"));
        System.out.println();
        System.out.println(IsValidParentheses("()("));
        System.out.println(IsValidParentheses("((())"));
        System.out.println(IsValidParentheses(")(())("));
    }

    public static boolean IsValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            if (symbol == '(') {
                stack.push(symbol);
            }
            if (symbol == ')') {
                if ((long) stack.size() == 0) {
                    return false;
                }
                stack.pop();
            }
        }
        return (long) stack.size() <= 0;
    }
}
