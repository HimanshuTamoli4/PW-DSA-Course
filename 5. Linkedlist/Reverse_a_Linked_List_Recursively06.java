class Reverse_a_Linked_List_Recursively06 {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }


    // implementation of insertion of a node at the end
    public void insertAtEnd(int newData){
        Node newNode = new Node(newData);

        // linkedlist is empty
        if(head == null){
            head = new Node(newData);
            return;
        }

        // linkedlist is not empty
        newNode.next = null;
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        return;
    }

    //  implementation of insertion of a node at the beginning
    public void insertAtBeginning(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    // implementation of insertion of a node after any node
    public void insertAfter(Node prev_node, int newData){
        if(prev_node == null){
            System.out.println("The previous node cannot contain the null values");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prev_node.next;
        prev_node.next = newNode;

    }

    // Implementation of reversal of linkedlist iteratevely 
    public void reverseLL(){
        Node curr = head;
        Node prev = null;
        Node nextptr = null ;
        while (curr!= null) {
            nextptr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextptr;
            
        }
        head = prev;
        return ; 
    }

    // implementation of reversal of linkedlist recursively 
    public void reversalRec(Node curr , Node prev){
        if(curr.next == null){
            head = curr;
            curr.next = prev ;
             return ;
        }

        Node nextptr = curr.next;
        curr.next = prev ;
        reversalRec(nextptr, curr);
    }

    
    
    // implementation of displaying the linkedlist
    public void displayLL(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        Reverse_a_Linked_List_Recursively06 llist = new Reverse_a_Linked_List_Recursively06();
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(8);
        

        System.out.println("Before insertion of 10, 1 and 19");
        llist.displayLL();
        System.out.println();

        llist.insertAtEnd(10);
        llist.insertAtBeginning(1);
        llist.insertAtBeginning(19);

    
        System.out.println("After insertion of 10, 1 and 19");
        llist.displayLL();
        System.out.println();

       llist.insertAfter(llist.head.next.next.next, 13);
       llist.displayLL();
        System.out.println();

        // llist.reverseLL();
        // System.out.println("reverse linked list is :");
        // llist.displayLL();
        // System.out.println();

             llist.reversalRec(llist.head, null);
        System.out.println("reverse linked list is :");
        llist.displayLL();
        System.out.println();

    }
}