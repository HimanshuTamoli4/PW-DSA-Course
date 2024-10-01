import java.util.*;

public class Deque07 {
    public static void main(String[] args) {
        Deque<Integer> de = new ArrayDeque<>();
        de.addLast(5);
        de.addLast(7);
        de.addLast(9);
        System.out.println("Deque output looks like : " + de);
        de.removeLast();
         System.out.println("Deque output looks like after deletion  : " + de);
         de.addLast(45);
         de.removeFirst();
           System.out.println("Deque output looks like after deletion  : " + de);
    }
}