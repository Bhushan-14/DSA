package String;
import java.util.*;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String s1 = sc.nextLine();
        String result1 = removeDuplicateLetters(s1);
        System.out.println("Output: " + result1);

        System.out.println("\nEnter the second string: ");
        String s2 = sc.nextLine();
        String result2 = removeDuplicateLetters(s2);
        System.out.println("Output: " + result2);

        sc.close();
    }

    public static String removeDuplicateLetters(String s) {
        HashMap<Character, Integer> lastOccurrence = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            lastOccurrence.put(s.charAt(i), i);
        }

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (!seen.contains(currentChar)) {
                while (!stack.isEmpty() && currentChar < stack.peek() && i < lastOccurrence.get(stack.peek())) {
                    seen.remove(stack.pop());
                }
                seen.add(currentChar);
                stack.push(currentChar);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        return result.toString();
    }
}
