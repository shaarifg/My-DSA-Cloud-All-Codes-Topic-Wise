package implementation;

public class BST {
    class Node{
        private int val;
        private Node left;
        private Node right;
        private int height;

        Node(int data){
            this.val = data;
        }
    }

    private Node root;

    public Node insert(int data){
        if(root == null){
            Node node  = new Node(data);
            root = node;
            return node;
        }
//        if(data >= root.val){
//         root.right = insert(data);
//        }
//        if(data<root.val){
//            root.left = insert(data);
//        }
        return root;
    }
    private Node insert(Node node, int data ){
        if(data >= root.val){
            root.right = insert(data);
        }
    }
}
