import java.util.*;

// 20 Valid Parentheses | Time: O(n)  Space: O(n)
public class ValidParentheses {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');          // push the closing bracket we expect
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brackets:");
        System.out.println(new ValidParentheses().isValid(sc.nextLine().trim()));
    }
}
