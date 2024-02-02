import java.util.*;

class Solution {
    public static String smallestSubsequence(String s) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter s String: ");
        String s = sc.nextLine();
        String result = smallestSubsequence(s);
        System.out.println("Output: " + result);
    }
}
