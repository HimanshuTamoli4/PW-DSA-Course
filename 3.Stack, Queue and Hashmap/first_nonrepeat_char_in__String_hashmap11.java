// Time complexity = O(n)
// Space complexity = O(n)


import java.util.Scanner;
import java.util.*;

public class first_nonrepeat_char_in__String_hashmap11 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string: ");
    String str = sc.nextLine() ;

    HashMap<Character , Integer> map = new HashMap<>();

    // construction of hashtable 
    // where key = Unique  char in string
    //       value = Frequency of a each character in the 
    for(int i =0 ; i<str.length() ;i++){
        if(map.containsKey(str.charAt(i))){
            map.put(str.charAt(i) , map.get(str.charAt(i)) + 1);
        }
        else{
            map.put(str.charAt(i), 1);
        }

    } 


    // Scaning the entire hashtable to get the first nonrepeated character 
    int res = -1 ;
    for(int i = 0 ; i<str.length() ; i++ )
    {
        if(map.get(str.charAt(i)) == 1){
            System.out.println("The first non Repeating character index is: " + i);
            res = 1 ;
            break ;
        }
       
    }

     if(res==-1){
            System.out.println("NO nonrepeated character present in array ");
            
        }

 }   
}
