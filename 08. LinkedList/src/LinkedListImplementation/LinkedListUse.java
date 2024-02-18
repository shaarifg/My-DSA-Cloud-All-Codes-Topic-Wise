package LinkedListImplementation;
/*Class which is using LinkedList methods*/
public class LinkedListUse {

    public static void main(String[] args) {
        LinkedList<Integer> list  = new LinkedList<>();
//        list.add(10);
//        list.add(12);
//        list.add(14);
//        list.add(14);
//        list.add(122);

//        add at given index
//        list.add(3, 11);
//        list.print();
//        list.delete(3);
            list.addRecur(0, 3);
            list.addRecur(1, 4);
            list.addRecur(2, 3);
            list.addRecur(3, 3);
//        list.delete(0);
        list.print();
        System.out.println("\nSize of LinkedList is: "+list.size());;
    }
}
