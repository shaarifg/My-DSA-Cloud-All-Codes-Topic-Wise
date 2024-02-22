package Implementation;
/*Class which is using LinkedList methods*/
public class LinkedListUse {

    public static void main(String[] args) {
//        LinkedList<Integer> list  = new LinkedList<>();
//        list.add(10);
//        list.add(12);
//        list.add(14);
//        list.add(14);
//        list.add(122);

//        add at given index
//        list.add(3, 11);
//        list.print();
//        list.delete(3);
//            list.addRecur(0, 3);
//            list.addRecur(1, 4);
//            list.addRecur(2, 3);
//            list.addRecur(3, 3);
//        list.delete(0);
//        list.print();




        // use of doubly LL

        DoublyLL list = new DoublyLL();

//        list.insertFirst(3);
//        list.insertFirst(6);
//        list.insertFirst(36);
//        list.insertFirst(4);
//        list.insertFirst(77);

        list.insertLast(3);
        list.insertLast(43);
        list.insertLast(8);
        list.insertLast(65);
        list.insertAfter(65, 10);

        System.out.println("\nSize of LinkedList is: "+list.size());
        list.display();
    }
}
