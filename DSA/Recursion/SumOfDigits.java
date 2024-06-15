package Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int result = sumOfDigit(n);
        System.out.println("The sum of digit of number " + n + " is: " + result);
        int result1 = productOfDigit(n);
        System.out.println("TThe product of digit of number" + n + " is: " + result1);
    }
    public static int sumOfDigit(int n){
        if(n == 0){
            return 0;
        }
        else {
            return (n%10) + sumOfDigit(n/10);
        }
    }
    public static int productOfDigit(int n){
        if(n%10 == n){
            return n;
        }
        else{
            return (n%10) * productOfDigit(n/10);
        }
    }
}
