import java.util.LinkedList;

public class Insertion_in_Linked_List_At_the_end01 {
    Node head ;
    class Node{
        int data ;
        Node next ;
        Node(int d ){
            data = d ;
            next = null;
        }
    }

    // Inserting data at the end 
    public void InsertAtEnd(int newdata){
        Node newNode = new Node(newdata);

        if(head == null){ // ==> if linked list is empty 
            head = new Node(newdata);
            return ;
        }
        
        //  when linked list is not empty 
        newNode.next = null;
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        
        temp.next =  newNode;
        return;
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
        Insertion_in_Linked_List_At_the_end01 list = new Insertion_in_Linked_List_At_the_end01();
        list.InsertAtEnd(2);
        list.InsertAtEnd(4);
        list.InsertAtEnd(8);
        System.out.println(" Linked list before insertion o 10  ");
        list.diplay();
        System.out.println();
        
        list.InsertAtEnd(10);
         System.out.println(" Linked list after insertion of 10  ");
        list.diplay();
         System.out.println();
    }
}