package String;

import java.util.HashMap;
import java.util.Scanner;

public class WordPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pattern: ");
        String pattern = sc.nextLine();
        System.out.println("Enter Strings: ");
        String s = sc.nextLine();
        System.out.println(wordPattern(pattern,s));
    }
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> charToWord = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            String currentWord = words[i];

            if (charToWord.containsKey(currentChar)) {
                if (!charToWord.get(currentChar).equals(currentWord)) {
                    return false;
                }
            } else {
                if (charToWord.containsValue(currentWord)) {
                    return false;
                }
                charToWord.put(currentChar, currentWord);
            }
        }

        return true;
    }
}