package String;

public class StringComparision {

    public static void main(String[] args) {
        String a = "Bhushan";
        String b = "Bhushan";
        System.out.println(a == b); //Checks if reference variables pointing to same object

        //System.out.println(a.equals(b));

        //It creates an object in heap instead in string pool.
        String name = new String("Bhushan");
        String name1 = new String("Bhushan");
        System.out.println(name == name1);

        String c = a;
        System.out.println(a == b);

        for(int i = 0; i < name.length();i++){
            System.out.println(name.charAt(i));
        }
    }
}
