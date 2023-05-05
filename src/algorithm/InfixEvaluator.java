package algorithm;

import java.util.Stack;

public class InfixEvaluator {

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private static int precedence(char operator) {
        return switch (operator) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            default -> 0;
        };
    }

    private static int applyOperator(char operator, int operand1, int operand2) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }

    public static int evaluate(String expression) {
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c)) {
                int operand = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    operand = operand * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--;
                operands.push(operand);
            } else if (isOperator(c)) {
                while (!operators.empty() && precedence(operators.peek()) >= precedence(c)) {
                    int operand2 = operands.pop();
                    int operand1 = operands.pop();
                    char operator = operators.pop();
                    int result = applyOperator(operator, operand1, operand2);
                    operands.push(result);
                }
                operators.push(c);
            } else if (c == '(') {
                operators.push(c);
            } else if (c == ')') {
                while (operators.peek() != '(') {
                    int operand2 = operands.pop();
                    int operand1 = operands.pop();
                    char operator = operators.pop();
                    int result = applyOperator(operator, operand1, operand2);
                    operands.push(result);
                }
                operators.pop();
            }
        }

        while (!operators.empty()) {
            int operand2 = operands.pop();
            int operand1 = operands.pop();
            char operator = operators.pop();
            int result = applyOperator(operator, operand1, operand2);
            operands.push(result);
        }

        if (operands.size() != 1 || !operators.empty()) {
            throw new IllegalArgumentException("Invalid expression");
        }

        return operands.pop();
    }

    public static void main(String[] args) {
        String expression = "2 + 3 * 4 - 5";
        int result = evaluate(expression);
        System.out.println(expression + " = " + result);
    }

}
