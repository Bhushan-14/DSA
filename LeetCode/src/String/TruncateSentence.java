package String;

import java.util.Scanner;

public class TruncateSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String s = sc.nextLine();
        System.out.println("Enter count: ");
        int k = sc.nextInt();

        String truncatedSentence = truncateSentence(s, k);
        System.out.println("Truncated Sentence: " + truncatedSentence);
    }

    public static String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder truncatedSentence = new StringBuilder();
        for (int i = 0; i < k && i < words.length; i++) {
            truncatedSentence.append(words[i]);
            if (i < k - 1 && i < words.length - 1) {
                truncatedSentence.append(" ");
            }
        }
        return truncatedSentence.toString();
    }
}
