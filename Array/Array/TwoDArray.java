package Array;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[][] num = {
//                {1,2,3},
//                {4,3,2},
//                {2,3,5}
//        };
//
//        for (int i = 0;i < num.length;i++){
//            for(int j = 0;j < num.length;j++){
//                System.out.print(num[i][j]);
//            }
//            System.out.println("");
//        }

        int[][] arr = new int[3][4];

        //arr.length gives size of rows
        for(int row = 0;row < arr.length;row++){
            //foreach column in every row
            for(int col = 0;col < arr[row].length;col++){
                arr[row][col] = sc.nextInt();
            }
        }

        //Output
        for(int row = 0;row < arr.length;row++){
            for(int col = 0;col < arr[row].length;col++){
                System.out.print(" "+arr[row][col]);
            }
            System.out.println();
        }

        //Array without row and col size
//        int[][] arr = {
//                {1,2,3,4},
//                {5,6},
//                {7,8,9}
//        };
//        for(int row = 0; row < arr.length;row++){
//            for(int col = 0;col < arr[row].length;col++){
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }
    }
}
