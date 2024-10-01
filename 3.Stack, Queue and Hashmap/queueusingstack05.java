//  implementation of queue data structure using stack 
// time complexity of enqueue : O(1)
// time complexity of dequeue : O(n)
// space complexity = O(n)


import java.util.Stack;

public class queueusingstack05 {
    public static Stack<Integer> stack1 = new Stack<>() ;
    public static Stack<Integer> stack2 = new Stack<>() ;

  // insertion of the data in the queue      
 // time complexity = O(1)
static void enqueue(int data){
    stack1.push(data);
}

  // insertion of the data from  the queue  - FIFO
  static int dequeue(){
    int ele ;
    if(stack1.empty()&&stack2.empty()){
        System.out.println("Queue is empty ");
        System.exit(0);
    }
    // push all the elements from stack1 to stack 2 
    // time complexity = O(n)
    if(stack2.empty()){
        while(!stack1.empty()){
            ele = stack1.pop() ;
            stack2.push(ele);
        }
    }

    // pop the top element from stack 2
    // FIFO - first in first out 
    ele = stack2.pop();
    return ele ;

  }      


    public static void main(String[] args) {
        queueusingstack05 q = new queueusingstack05();

        q.enqueue(1);
         q.enqueue(2);
          q.enqueue(3);
           q.enqueue(4);

       System.out.println("Deleted element is : " + q.dequeue()); 
        System.out.println("Deleted element is : " + q.dequeue());    


    }
}
