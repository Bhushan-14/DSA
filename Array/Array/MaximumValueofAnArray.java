package Array;

public class MaximumValueofAnArray {
    public static void main(String[] args) {
        int[] arr = {17,34,53,39,31,87};
        System.out.println(max(arr));

        System.out.println(maxRangr(arr,1,4));
    }
    static int max(int[] arr) {
        if(arr == null){
            return -1;
        }
        int max_element = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max_element){
                max_element = arr[i];
            }
        }
        return max_element;
    }
    static int maxRangr(int[] arr,int start,int end) {
        int max_element = arr[start];
        for (int i = start; i < end; i++) {
            if(arr[i] > max_element){
                max_element = arr[i];
            }
        }
        return max_element;
    }
}
