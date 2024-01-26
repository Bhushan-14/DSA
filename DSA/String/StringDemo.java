package String;

public class StringDemo {
    public static void main(String[] args) {
        String name = "Bhushan";
//        System.out.println(name);

        String a = "Bhushan";
        System.out.println(a);


        //Here we are not change the value of a, we create new object
        //And heap it is deleted first a due to garbage collection.
        a = "Sagar";
        System.out.println(a);
        String b = "Bhushan";
    }
}
/*
 String is class in java since it start with capital letter.
    String name = "Bhushan"
    - here Bhushan is an object.
    - name is reference variable.
    - String is datatype.
 */
/*
String a = "Bhushan"
String b = "Bhushan"
- here both reference variable which are store in stack are reference
  to only single value of Bhushan in String pool in Heap Memory.
- We cannot change the value of object in String Poll it is creating new object if we try that.
 */
/*
String pool -> String pool is separate memory structure inside heap memory.
            -> Which stores similar value of Strings.
 */