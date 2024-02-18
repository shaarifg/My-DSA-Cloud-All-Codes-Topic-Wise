package questions;

import LinkedListImplementation.LinkedList;
import LinkedListImplementation.Node;

public class ReverseLinkedList {
    public static void main(String[] args) {
//        Class from another package
        LinkedList<Integer> list  = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.print();

    }

//    Method to Reverse the LL
    public Node<Integer> reverse(Node<Integer> head){
        if(head == null) {
            return head;
        }
        return  null;
    }

}
