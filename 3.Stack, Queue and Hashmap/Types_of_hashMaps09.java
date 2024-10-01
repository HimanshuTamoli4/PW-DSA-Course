import java.util.*;

public class Types_of_hashMaps09 {
    public static void main(String[] args){
        // unordered 
        HashMap<Integer, String> map = new HashMap<>();
          map.put(4, "Priya");
        map.put(2, "Shivam");
        map.put(9, "Siddharth");
        map.put(1, "Ram");
        map.put(10, "Rama");
        map.put(5, "Sham");

        System.out.println("HashMap class map output is: "+map);

        // order of insertion is preserved
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(4, "Priya");
        map1.put(2, "Ajay");
        map1.put(9, "Piyush");
        map1.put(1, "Jeet");

        System.out.println("LinkedHashMap class map output is: "+map1);
        
        // Sorted data on the basis of the key
        TreeMap<Integer, String> map2 = new TreeMap<>();
        map2.put(4, "Priya");
        map2.put(2, "Shivam");
        map2.put(9, "Siddharth");
        map2.put(1, "Ram");
        map2.put(10, "Rama");
        map2.put(5, "Sham");

        System.out.println("TreeMap class map output is: "+map2);
      
    }
}