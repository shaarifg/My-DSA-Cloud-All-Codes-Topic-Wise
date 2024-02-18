package LinkedListImplementation;


/* All methods of LinkedList are Implemented in this class only*/
public class LinkedList<T> {
    private Node<T> head;
    private int size;

//    Insert Method
       public void add(T data){
         Node<T> newNode  = new Node<>(data);
         if(head == null){
             head = newNode;
         }else {
//             We can Optimize it by maintaining a tail node
         Node<T> temp  = head;
             while (temp.next != null){
                 temp = temp.next;
             }
         temp.next = newNode;
         }
         size++;
    }

//      Method to insert Node at given Position
    void add(int idx, T data){
           Node<T> prev  = head;
           int count = 0;
         if (head == null || idx ==0){
             Node<T> newNode = new Node<>(data);
             head = newNode;
             head.next = prev;
             size++;
         }else {
//             Following use Make Before Break concept.
            while (count < idx-1){
                count++;
                prev = prev.next;
            }
            Node<T> newNode = new Node<>(data);
            newNode.next = prev.next;
            prev.next = newNode;
            size++;
         }

    }

//    Method to Delete Node at given position
    void delete(int idx){
           Node<T> prev = head;
           int count =0;
           if (head ==null){
               System.out.println("List is Empty");
           }
           else if(idx == 0 && head != null ){
                head = prev.next;
                size--;
           }else {
               while (count < idx-1){
                   count++;
                   prev = prev.next;
               }
              if (prev.next !=null) prev.next = prev.next.next;
              size--;
           }
    }


//    Method to print the LL
    public void print(){
        Node<T> temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
//    Method to get size;
    int size(){
           return this.size;
    }




//ADVANCE----> Recursive Approach

// Insert Recursively
    void addRecur(int pos, T data){
           if (pos == 0){
               Node<T> temp = head;
               head = new Node<>(data);
               head.next = temp;
           }else {
               addRecur(pos-1, data);
           }
    }
}






