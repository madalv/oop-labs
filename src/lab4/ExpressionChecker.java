package lab4;


import java.util.Stack;

public class ExpressionChecker {

    public static String checkParanthethis (String expression) {

        Stack<Character> parStack = new Stack<>();
        String result = "";

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') parStack.push('(');

            try { // if stack is empty, push random char into it so it won't be empty and paranth will be inc placed
                if (expression.charAt(i) == ')') parStack.pop();
            }
            catch (Exception e) {
                parStack.push('!');
            }
        }

        if (parStack.isEmpty()) result = "Expression '" + expression + "' has paranthethis correcly placed.";
        else result = "Expression '" + expression + "' has paranthethis incorrecly placed.";

        return result;
    }
}
