package Strings;

import java.util.Scanner;

public class StringRotations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first String: ");
        String s1 = sc.nextLine();
        System.out.println("Enter second String: ");
        String s2 = sc.nextLine();

        if (stringRotations(s1, s2)) {
            System.out.println("Strings have rotation");
        } else {
            System.out.println("Strings do not have rotation");
        }
    }

    public static boolean stringRotations(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        s1 = s1 + s1;
        return s1.contains(s2);
    }
}
