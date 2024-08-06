class Node {
    int data ; 
    Node next ; 

    Node (int data) {
        this.data = data ; 
        this.next = null ;
    }

}




public class SingleLinked {

    Node head ; 

    public SingleLinked() {
        this.head = null ;
    }

    public void printList() {
        Node current = head ; 

        while (current != null ) {
            System.out.println(current.data + " ,") ;
            current = current.next ; 

        }
    }





    
    public static void main(String[] args) {

        SingleLinked list = new SingleLinked() ; 


        list.head = new Node(1) ;
        list.head.next = new Node(2) ; 
        list.head.next.next = new Node(3) ;
        list.head.next.next.next = new Node(4)  ;
         

        System.out.println();
      
      
        list.printList(); 



        
    }
}
