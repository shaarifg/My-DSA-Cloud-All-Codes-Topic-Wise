package implementation;

public class TreeMain {
    public static void main(String[] args) {
//        BinaryTest

//        BinaryTree tree =new BinaryTree();
//        tree.takeInput();
//        tree.displayBetter();

//        BST Test
//        BST bst = new BST();
//        int[] data ={10, 2, 45, 5, 6, 7};
//        bst.populate(data);
//       bst.display();

//       use to print tree int sorted manner
//        bst.inOrder();

//        Test AVL
//        AVL avl = new AVL();
//        for (int i = 0; i < 1000; i++) {
//            avl.insert(i);
//        }
//        System.out.println(avl.height());

//        Segment Tree Use
        int data[] = {1, 4, 5, 7, -4};
        SegmentTrees st = new SegmentTrees(data);
        st.update(0, 10);
        st.display();
        System.out.println(st.query(0, 2));
    }

}
