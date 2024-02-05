package Recursion;

public class Main {
    public static void main(String[] args) {
        message();
        //write a Hello world 5 time without modify function
        //Then we have two choice
        /*
        1. call function 5 times.
        2. create different 5 functions and call them.
         */
        /*
        message1();
        message2();
        message3();
        message4();
         */
    }
    static void message() {
        System.out.println("Hello World");
        message1();
    }
    //or
    static void message1(){
        System.out.println("Hello World");
        message2();
    }
    static void message2(){
        System.out.println("Hello World");
        message3();
    }
    static void message3(){
        System.out.println("Hello World");
        message4();
    }
    static void message4(){
        System.out.println("Hello World");
    }
}
/*
A recursion is a process in which a function calls itself directly or indirectly,
 */
