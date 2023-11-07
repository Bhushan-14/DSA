package Searching.BinarySearch;

import java.util.Scanner;

public class SmallestLetter {
    //Find the smallest letter than greater than target
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        char[] arr = new char[n];
        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next().charAt(0);
        }

        System.out.print("Enter the target element to search for: ");
        char target = scanner.next().charAt(0);

        int ans = smallestNumber(arr,target);
        System.out.println("Smallest letter is which grater than target "+arr[ans]+" for target "+target+" is found at "+ans);

    }

    static char smallestNumber(char[] arr,char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int middle = start - ((end - start) / 2);
            if(target < arr[middle]){
                end = middle - 1;
            }
            else if (target > arr[middle]){
                start = middle + 1;
            }
        }
        return arr[start];
    }
}
