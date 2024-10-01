 import java.util.LinkedList;

public class Insertion_at_beginning02 {
    Node head ;
    class Node{
        int data ;
        Node next ;
        Node(int d ){
            data = d ;
            next = null;
        }
    }


    // Inserting data at beginning 
    public void insertATbeginning(int newdata){
    Node newNode = new Node(newdata);
    newNode.next = head;
    head = newNode ;
    }
   

    // displaying the linked list 
    public void diplay(){
        Node current = head ;
        while(current!= null){
            System.out.println(current.data + " ");
            current = current.next;
        }
    }
    
    public static void main(String[] args) {
        Insertion_at_beginning02 list = new Insertion_at_beginning02();
        list.insertATbeginning(2);
        list.insertATbeginning(4);
        list.insertATbeginning(8);
        System.out.println(" Linked list before insertion o 10  ");
        list.diplay();
        System.out.println();
        
        list.insertATbeginning(10);
         System.out.println(" Linked list after insertion of 10  ");
        list.diplay();
         System.out.println();
    }
}
    

