package Recursion;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int reversed = reverseNumber(n, 0);
        System.out.println("Reversed number is: " + reversed);
        if (palindrome(n)) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }
    }

    static int reverseNumber(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        return reverseNumber(n / 10, sum);
    }
    static boolean palindrome(int n){
        return n == reverseNumber(n,0);
    }
}
