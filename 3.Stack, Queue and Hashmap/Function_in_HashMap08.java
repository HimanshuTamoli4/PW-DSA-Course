import java.util.HashMap;
import java.util.Map;

public class Function_in_HashMap08 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap = new HashMap<>();
        // 1. Functionality of put function 
        hashmap.put(1, "Ishita");
        hashmap.put(5, "Himanshu");
        hashmap.put(3, "Anshika");
        hashmap.put(8, "Ishi");
        System.out.println("Hash map of the given data: "+ hashmap);    

        // 2. Functionality of get function     
        String res = hashmap.get(3);
        System.out.println("Value for the given key is " + res);

        // 3. Functionality of Cointains key  function
        System.out.println(hashmap.containsKey(2)); 

        // 4. Functionality of remove  function
        
        hashmap.remove(1);
        System.out.println("Updated hash map: " + hashmap);

        // 5. Functionality of entryset function 
        for(Map.Entry<Integer, String> e :hashmap.entrySet()){
            System.out.println("Hashmap is :");
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }

    
}
