package Array;
class ArrayDemo {
    public static void main(String[] args){
        //To store a roll no
        int no = 19;

        //To store a name
        String name = "Sagar";

        //To store a 5 roll no
        int no1 = 20;
        int no2 = 21;
        int no3 = 22;
        int no4 = 23;
        int no5 = 24;

        //To store a 500 roll no we need to write this syntax 500 times.
        //Instead of that we use array.
        //Array is collection of datatypes.

        //Syntax:
        //data_type[] variable_name = new data_type[size];

        //Store 5 roll no
        int[] r_no = new int[5];
        //or
        int[] r_no1 = {12,13,14,15,16};

        //Array is collection of similar data type.
        //i.e if array is int then it contains only int

        int[] rno; //Declaration of array. rno is getting defined into the stack.
        //Declaration happens at compile time.

        rno = new int[5]; //Actually here object is being created in the memory(Heap).
        //And memory allocation happens at run time is known as dynamic memory allocation.


        System.out.println(rno[1]);
    }
}


/*
    Array objects are syored in heap memory.
    And objects stored in heap memory are may or may not be continous it totaly depends on JVM.
    Hence Array objects are may or may no be continous.
*/