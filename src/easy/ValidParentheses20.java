package easy;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @Description:
 * @Author: guojun
 * @Date: 2019/1/7
 */
public class ValidParentheses20 {
    public boolean isValid(String s) {
        char[] parents = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : parents) {
            if (c == '(' || c == '{' || c == '[') {
                stack.add(c);
            }else {
                if (stack.empty()) {
                    return false;
                }
                switch (c) {
                    case ')':
                        if (stack.pop() != '(') {
                            return false;
                        }
                        break;
                    case '}':
                        if (stack.pop() != '{') {
                            return false;
                        }
                        break;
                    case ']':
                        if (stack.pop() != '[') {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }

            }
        }
        return stack.empty();
    }
}
