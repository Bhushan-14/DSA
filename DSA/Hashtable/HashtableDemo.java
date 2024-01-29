package Hashtable;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1,"Sagar");
        ht.put(2,"Mayur");
        ht.put(3,"Hrishi");
        System.out.println("Mapping of ht: "+ht);
        for (Map.Entry<Integer, String> e:ht.entrySet()) {
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
