package t;

import java.util.Stack;

public class fourthTask {
    public static void main(String[] args) {
        String expression = "(4+5)*10-1";
        try {
            long result = evaluateExpression(expression);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("WRONG");
        }
    }

    private static long evaluateExpression(String expression) throws Exception {
        Stack<Long> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();
        int i = 0;

        while (i < expression.length()) {
            char c = expression.charAt(i);

            if (Character.isWhitespace(c)) {
                i++;
                continue;
            }

            if (Character.isDigit(c) || (c == '-' && (i == 0 || expression.charAt(i - 1) == '('))) {
                StringBuilder sb = new StringBuilder();
                if (c == '-') {
                    sb.append(c);
                    i++;
                }
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    sb.append(expression.charAt(i++));
                }
                numbers.push(Long.parseLong(sb.toString()));
            } else if (c == '(') {
                operators.push(c);
                i++;
            } else if (c == ')') {
                while (operators.peek() != '(') {
                    numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
                }
                operators.pop();
                i++;
            } else if (isOperator(c)) {
                while (!operators.isEmpty() && hasPrecedence(c, operators.peek())) {
                    numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
                }
                operators.push(c);
                i++;
            } else {
                throw new Exception("Invalid character");
            }
        }

        while (!operators.isEmpty()) {
            numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
        }

        return numbers.pop();
    }

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
            return false;
        }
        return true;
    }

    private static long applyOperation(char op, long b, long a) throws Exception {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new Exception("Division by zero");
                }
                return a / b;
            default:
                throw new Exception("Invalid operator");
        }
    }
}