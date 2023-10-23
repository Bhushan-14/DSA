package SearchingAlgorithm.LinearSearch;

import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();
        System.out.print("Enter a character to search for: ");
        char target = sc.next().charAt(0);

        boolean found = search(name, target);
        if (found) {
            System.out.println("The character was found in the string.");
        } else {
            System.out.println("The character was not found in the string at");
        }
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            System.out.println("String is Empty.");
            return false;
        }
        for (int index = 0; index < str.length(); index++) {
            if (target == str.charAt(index)) {
                return true;
            }
        }
        return false;
    }
}
