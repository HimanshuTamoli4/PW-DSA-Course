import java.util.Stack;

public class Stack01 {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(2);
        stack1.push(4);
        stack1.push(6);
        stack1.push(9);
        // push the element inside the stack 
        System.out.println("The topmost element in the stack before deletion is :" +stack1.peek());

        // Delete the topmost element in the stack
        stack1.pop();

        System.out.println("The topmost element in the stack  After deletion is :" +stack1.peek());

        // Searching an element in the stack 
        System.out.println("Element 4 is present at the positon: " + stack1.search(4));

        // check whether stack is empty or not 
        System.out.println("Is Stack Empty or  not: "+ stack1.empty());

    }
}
