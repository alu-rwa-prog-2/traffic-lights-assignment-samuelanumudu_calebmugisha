//authors: Caleb Mugisha, Samuel Anumudu

package qn2;

import java.util.HashMap;



public class hashMap {
    public static void main(String args[]) {
        // create two hash maps
        HashMap<Integer, String> hash_map1 = new HashMap<Integer, String>();
        HashMap<Integer, String> hash_map2 = new HashMap<Integer, String>();
        HashMap<Integer, String> hash_map3 = new HashMap<Integer, String>();
        HashMap<Integer, String> hash_new = new HashMap<Integer, String>();

        // populate hash maps

        hash_map1.put(1, "Mugisha");
        hash_map1.put(2, "Anumudu");
        hash_map1.put(3, "Sam");

        System.out.println("\nValues in first map: " + hash_map1);

        hash_map2.put(4, "Zuba");
        hash_map2.put(5, "Ariel");
        hash_map2.put(6, "Marley");

        System.out.println("\nValues in second map: " + hash_map2);
        hash_map2.putAll(hash_map1);
        
        hash_map3.put(7, "Munana");
        hash_map3.put(8, "Unesha");
        hash_map3.put(9, "Ruganzu");

        hash_map3.putAll(hash_map2);
        System.out.println("\nNow values in second map: " + hash_map2);
        System.out.println("\nNow values in third map: " + hash_map3);

       
    }
}
