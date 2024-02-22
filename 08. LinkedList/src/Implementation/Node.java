package Implementation;
/*
1.Linked List is a part of the Collection framework present in java.util package.
2.which is a linear data structure where the elements are not stored in contiguous locations and
every element is a separate object with a data part and address part
*/
public class Node<T> {
    T data;
    Node<T> next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }
}
