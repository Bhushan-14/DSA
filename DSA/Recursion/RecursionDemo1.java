package Recursion;

public class RecursionDemo1 {
    public static void main(String[] args) {
        //Print number from 1 to 5
        printNumber(1);
//        printNumber(2);
//        printNumber(3);
//        printNumber(4);
//        printNumber(5);
    }
    static void printNumber(int n){
        System.out.println(n);
        if(n < 5){
            printNumber(n+1);
        }
    }
}
