package Array;

import java.util.Arrays;
import java.util.Scanner;

class ArrayInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Taking hardcoded value
        //Array of primitives
//        int[] arr = new int[5];
//        arr[0] = 21;
//        arr[1] = 22;
//        arr[2] = 23;
//        arr[3] = 24;
//        arr[4] = 25;
//        System.out.println(arr[1]);

        //Taking user input using for loop
//        System.out.println("Enter "+arr.length+" elements in array: ");
//        for(int i = 0;i < arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        for(int i = 0;i < arr.length;i++){
//            System.out.println("Array Element "+i+" is : "+arr[i]);
//        }

        //For each loop
//        for(int i : arr){
//            System.out.println(i); //Here i represents element of an array.
//        }

        //Using toString() method of an Array class
//        System.out.println(Arrays.toString(arr));

        //Array of Objects

        String[] str = new String[4];
        System.out.println("Enter a "+str.length+" Strings");
        for(int i = 0;i < str.length;i++){
            str[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(str));

        str[1] = "Bhushan";
        System.out.println(Arrays.toString(str));
    }
}