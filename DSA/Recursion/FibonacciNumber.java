package Recursion;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter upto which number you want to fibonacci number: ");
        int n = sc.nextInt();
        System.out.println(fibonacciNumber(n));
    }
    static int fibonacciNumber(int n){
        if( n < 2){
            return n;
        }
        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }
}
