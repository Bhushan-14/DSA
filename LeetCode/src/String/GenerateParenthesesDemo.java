package String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GenerateParenthesesDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of parentheses to generate: ");
        int n = sc.nextInt();
        List<String> result = generateParenthesis(n);
        System.out.println(result);
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisHelper(n, 0, 0, new StringBuilder(), result);
        return result;
    }
    private static void generateParenthesisHelper(int n, int open, int close, StringBuilder current, List<String> result) {
        if (current.length() == 2 * n) {
            result.add(current.toString());
            return;
        }
        if (open < n) {
            current.append('(');
            generateParenthesisHelper(n, open + 1, close, current, result);
            current.deleteCharAt(current.length() - 1);
        }
        if (close < open) {
            current.append(')');
            generateParenthesisHelper(n, open, close + 1, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
}