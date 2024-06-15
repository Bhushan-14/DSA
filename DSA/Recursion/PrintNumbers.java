package Recursion;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
    //print n to 1
        System.out.println("Series is: ");
        display(n);
        //print 1 to n
        System.out.println("Series is: ");
        display1(n);
    }
    public static void display(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        display(n-1);
    }
    public static void display1(int n) {
        if (n == 0) {
            return;
        }
        display1(n - 1);
        System.out.println(n);
    }
}