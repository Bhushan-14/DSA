import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Given Array is: "+ Arrays.toString(arr));

        System.out.println("Enter target element: ");
        int target = sc.nextInt();
        int result = linearSearch(arr,target);
        if(result != -1){
            System.out.println("Target is found at "+result+" position");
        }
        else {
            System.out.println("Target does not found");
        }
    }
    private static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            System.out.println("Array is empty");
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
