
import java.util.Stack;
public class DSA_Q2 {

	    public static boolean isValid(String s) {
	        Stack<Integer> stack = new Stack<>();

	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);

	            if (c == '(' || c == '*') {
	                stack.push(i);
	            } else {
	                if (!stack.isEmpty()) {
	                    stack.pop();
	                } else {
	                    return false;
	                }
	            }
	        }

	        while (!stack.isEmpty()) {
	            int index = stack.pop();
	            char c = s.charAt(index);

	            if (c == '(') {
	                boolean hasMatch = false;

	                for (int i = index + 1; i < s.length(); i++) {
	                    if (s.charAt(i) == ')') {
	                        hasMatch = true;
	                        break;
	                    }
	                }

	                if (!hasMatch) {
	                    return false;
	                }
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        String s = "()";
	        boolean isValid = isValid(s);
	        System.out.println("Is valid: " + isValid);
	    }
	}
