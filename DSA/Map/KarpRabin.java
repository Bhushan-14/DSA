package Map;

import java.util.Scanner;

public class KarpRabin {
    private final int PRIME = 101;

    private long calculateHash(String str) {
        long hash = 0;
        for (int i = 0; i < str.length(); i++) {
            hash = (long) (hash + str.charAt(i) * Math.pow(PRIME, i));
        }
        return hash;
    }

    private long updateHash(long prevHash, char oldChar, char newChar, int patternLength) {
        long newHash = prevHash - (oldChar * power(PRIME, patternLength - 1)) % Integer.MAX_VALUE;
        newHash = (newHash * PRIME + newChar) % Integer.MAX_VALUE;
        return newHash;
    }

    private long power(int base, int exponent) {
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result = (result * base) % Integer.MAX_VALUE;
        }
        return result;
    }

    private void search(String text, String pattern) {
        int patternLength = pattern.length();
        long patternHash = calculateHash(pattern);
        long textHash = calculateHash(text.substring(0, patternLength));
        for (int i = 0; i <= text.length() - patternLength; i++) {
            if (textHash == patternHash) {
                if (text.substring(i, i + patternLength).equals(pattern)) {
                    System.out.println("Pattern found at index " + i);
                }
            }
            if (i < text.length() - patternLength) {
                textHash = updateHash(textHash, text.charAt(i), text.charAt(i + patternLength), patternLength);
            }
        }
    }

    public static void main(String[] args) {
        KarpRabin karpRabin = new KarpRabin();
        karpRabin.search("Sagarkunalkahul", "kunal");
    }
}





