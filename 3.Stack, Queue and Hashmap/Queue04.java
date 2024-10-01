import java.util.LinkedList;
import java.util.Queue;

public class Queue04 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // adding the data inside the queue
        for(int i =0 ;  i<10 ; i++){
            q.add(i);
        }

        System.out.println("Queue data is "+ q);


         System.out.println("The top element in the queue before deletion "+ q.peek());

        // Remove element  from the queue
        q.remove();


        //  Displaying topmost element in the queue 
        System.out.println("The top element in the queue After deletion "+ q.peek());

        // check the size of the queue 
        System.out.println("The current size of queue is : " + q.size() );

    }
    
}
