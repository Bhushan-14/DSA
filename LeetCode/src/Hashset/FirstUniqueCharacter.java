import java.util.HashMap;
import java.util.Scanner;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count occurrences of each character in the string
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        // If no non-repeating character is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        FirstUniqueCharacter solution = new FirstUniqueCharacter();
        int result = solution.firstUniqChar(inputString);

        System.out.println("Output: " + result);
    }
}
