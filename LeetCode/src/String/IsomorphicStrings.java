package String;

import java.util.Scanner;

public class IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string s: ");
        String s = sc.nextLine();
        System.out.println("Enter String t: ");
        String t = sc.nextLine();
        System.out.println(isIsomorphic(s, t));
    }
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] sToT = new int[128];
        int[] tToS = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if (sToT[charS] != 0) {
                if (sToT[charS] != charT) {
                    return false;
                }
            } else {
                sToT[charS] = charT;
            }
            if (tToS[charT] != 0) {
                if (tToS[charT] != charS) {
                    return false;
                }
            } else {
                tToS[charT] = charS;
            }
        }
        return true;
    }
}
