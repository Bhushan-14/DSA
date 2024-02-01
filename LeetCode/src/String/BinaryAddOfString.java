package String;

import java.util.Scanner;

public class BinaryAddOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Binary String a: ");
        String a = sc.next();
        System.out.println("Enter Binary String b: ");
        String b = sc.next();
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum = sum + (a.charAt(i) - '0');
                i = i - 1;
            }
            if (j >= 0) {
                sum = sum + (b.charAt(j) - '0');
                j = j - 1;
            }
            result.insert(0, sum % 2);
            carry = sum / 2;
        }
        return result.toString();
    }
}
