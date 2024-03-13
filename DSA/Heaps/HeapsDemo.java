package Heaps;

import Array.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

class Heap<T extends Comparable<T>> {
    private ArrayList<T> list;

    public Heap() {
        list = new ArrayList<>();
    }
    private void swap(int first, int second){
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second,temp);
    }
    private int parent(int index){
        return (index -1) / 2;
    }
    private int left(int index){
        return (2 * index) + 1;
    }
    private int right(int index){
        return (2 * index) + 2;
    }
    public void insert(T value){
        list.add(value);
        upheap(list.size() - 1);
    }
    private void upheap(int index){
        if(index == 0){
            return;
        }
        int p = parent(index);
        if(list.get(index).compareTo(list.get(p)) < 0){
            swap(index,p);
            upheap(p);
        }
    }
    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("Removing from empty Heap!");
        }
        T temp = list.get(0);
        T last = list.remove(list.size() - 1);
        if(!list.isEmpty()){
            list.set(0,last);
            downheap(0);
        }
        return temp;
    }
    private void downheap(int index){
        int min = index;
        int left = left(index);
        int right = right(index);
        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0){
            min = left;
        }
        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0){
            min = right;
        }
        if(min != index){
            swap(min,index);
            downheap(min);
        }
    }
    public ArrayList<T> heapSort() {
        ArrayList<T> sortedData = new ArrayList<>();
        try {
            while (!list.isEmpty()) {
                sortedData.add(remove());
            }
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
        return sortedData;
    }

}

public class HeapsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Heap<Integer> heap = new Heap<>();
        while (true){
            System.out.println("Choose an Option: ");
            System.out.println("1. Insertion: ");
            System.out.println("2. Remove: ");
            System.out.println("3. Heap Sort: ");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: 4");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the element to insert: ");
                    int insertValue = sc.nextInt();
                    heap.insert(insertValue);
                    break;
                case 2:
                    try{
                        int removedElement = heap.remove();
                        System.out.println("Removed element: " + removedElement);
                    }catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Heap Sort: "+heap.heapSort());
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
}
