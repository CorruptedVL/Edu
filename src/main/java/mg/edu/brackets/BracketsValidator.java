package mg.edu.brackets;

import java.util.ArrayDeque;
import java.util.Deque;

public class BracketsValidator implements Validator {
    @Override
    public boolean isValid(String chars) {

        if (chars.isEmpty()) return false;

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < chars.length(); i++) {
            char c = chars.charAt(i);
            switch (c) {
                case '(' -> stack.push(')');
                case '[' -> stack.push(']');
                case '{' -> stack.push('}');
                case ')', ']', '}' -> {
                    if (stack.isEmpty() || stack.pop() != c) return false;
                }
                default -> {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
