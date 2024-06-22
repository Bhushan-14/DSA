import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LinearSearchMapDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Given Array is: "+ Arrays.toString(arr));

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n;i++){
            map.put(arr[i], i);
        }

        System.out.println("Enter target element: ");
        int target = sc.nextInt();
        Integer result = map.get(target);
        if(result != null) {
            System.out.println("Target is at "+result+" index");
        }else{
            System.out.println("Target is not found");
        }

    }
}
