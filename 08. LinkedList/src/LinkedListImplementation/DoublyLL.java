package LinkedListImplementation;

public class DoublyLL {
    private Node head;
    int size = 0;



    // to insert at the beginning
    public void insertFirst(int data){
        Node newNode =  new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    // insert at last without using tail reference
    public void insertLast(int data){
        Node newNode = new Node(data);
        newNode.next = null;
        if(head == null){
            head = newNode;
            newNode.prev = null;
            return;
        }else{
        Node last  = head;
        while (last.next != null ){
            last = last .next;
        }
        last.next = newNode;
        newNode.prev = last ;

        }
    }

    public Node find(int after){
        if(head != null){
            Node temp = head;
            while (temp != null){
                if(temp.data==after){
                    return temp;
                }
                temp  = temp.next;
            }
        }
        return null;
    }

    public void insertAfter(int after, int value){
        Node afterNode= find(after);
        if(afterNode==null) {
            System.out.println(after+" does not exist");
            return;
        }

        Node newNode =  new Node(value);
        newNode.next = afterNode.next;
        afterNode.next = newNode;
        newNode.prev = afterNode;
        if(newNode.next !=null){
            newNode.next.prev = newNode;
        }
    }

    // display DLL
    public void display(){
        if (head == null){
            System.out.print("list is empty");
        }else{
            Node temp = head;
            Node tail = null;
            while (temp!=null){
                System.out.print(temp.data +" -> ");
                tail = temp;
                temp = temp.next;
            }
            System.out.println("END");
            System.out.println("Reverse Order");
            while (tail != null){
                System.out.print(tail.data +" -> ");
                tail = tail.prev;

            }
            System.out.println("END");
        }
    }




    //get the size of DLL
    public int size(){
        return size;
    }


    private class Node{
        int data;
        Node next;
        Node tail;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }
}
