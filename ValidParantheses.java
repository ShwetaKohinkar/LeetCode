import java.util.Stack;

public class ValidParantheses {

    public static void main(String[] args) {
        String str = "()[]{}";

        System.out.println(isValid(str));
    }

    public static boolean isValid(String s) {

        Stack<Character> parantheses = new Stack<>();

        for (Character c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    parantheses.push(c);
                    break;
                case ')':
                    if (parantheses.isEmpty() || parantheses.pop() != '(') return false;
                    break;
                case ']':
                    if (parantheses.isEmpty() ||parantheses.pop() != '[') return false;
                    break;
                case '}':
                    if (parantheses.isEmpty() ||parantheses.pop() != '{') return false;
                    break;
            }
        }
        return parantheses.isEmpty();
    }
}
