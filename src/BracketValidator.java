import java.util.Stack;
public class BracketValidator {
    public static String validateBracketSequence(String sequence) {
        Stack<Character> stack = new Stack<>();
        for (char c : sequence.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty() || !isMatching(stack.pop(), c)) {
                    return "Invalid";
                }
            }
        }
        return stack.isEmpty() ? "Valid" : "Invalid";
    }
    private static boolean isMatching(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '{' && closing == '}') ||
                (opening == '[' && closing == ']');
    }
    public static void main(String[] args) {
        String sequence1 = ")(){}";
        System.out.println(validateBracketSequence(sequence1)); // Output: Invalid

        String sequence2 = "[{()}()]{";
        System.out.println(validateBracketSequence(sequence2)); // Output: Invalid

        String sequence3 = "({})[]";
        System.out.println(validateBracketSequence(sequence3)); // Output: Valid
    }
}