package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //When we don't know size of Arrays then we use Array Lists.
        ArrayList<Integer> list = new ArrayList<Integer>(10);

        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);
        list.add(21);

        System.out.println(list);
        System.out.println(list.get(3));


        ArrayList<Integer> list1 = new ArrayList<Integer>(10);
        System.out.println("Enter elements in list: ");
        for (int i = 0; i < 5; i++) {
            list1.add(sc.nextInt());
        }

        System.out.println("Elements in lists are: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(list1.get(i));
        }

        ArrayList<ArrayList<Integer>> list3 = new ArrayList<>();

        //Initialization
        for (int l = 0; l < 3; l++) {
            list3.add(
                    new ArrayList<>()
            );
        }

        //Add elements in each list
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                list3.get(k).add(sc.nextInt());
            }
        }
        System.out.println(list3);
    }
}
