package implementation;

public class TreeMain {
    public static void main(String[] args) {
//        BinaryTest

//        BinaryTree tree =new BinaryTree();
//        tree.takeInput();
//        tree.displayBetter();

//        BST Test
        BST bst = new BST();
        int[] data ={10, 2, 45, 5, 6, 7};
        bst.populate(data);
       bst.display();

       //use to print tree int sorted manner
        bst.inOrder();
    }

}
