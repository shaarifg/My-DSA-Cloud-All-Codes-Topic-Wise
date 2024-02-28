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
//      dry-run on pen and paper will make easier to understand
        root = insert(root, data);
        return root;
    }

    private Node insert(Node node, int data){

//        if node is null then only new node will be created otherwise same node will be returned;
        if(node == null){
            node = new Node(data);
            return node;
        }
        if(data >= node.val){
            node.right = insert(node.right, data);//return of this function
        }
        if(data < node.val){
            node.left = insert(node.left, data);
        }
//        update the height after node insertion
        node.height = Math.max(height(node.left), height(node.right))+1;
        return node;
    }

    //    calculation of height of the tree
    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    public boolean isBalanced(){
        return Math.abs(height(root.left)-height(root.left))<=1;
    }

    public void display(){
        if(root==null){
            System.out.println("BST is Empty");
            return;
        }
//        System.out.println("Root Node: " +root.val);
        display(root,"Root Node: ");
    }
    private void display(Node node,String info){
        if (node ==null) return;
        System.out.println(info + node.val);
        display(node.left, "Left node of "+node.val+" : ");
        display(node.right, "Right node of "+node.val+" : ");
    }

//    for simplicity
    public void populate(int[] data){
        for (int i = 0; i < data.length; i++) {
            insert(data[i]);
        }
    }

    public void populateSorted(int[] nums){
        populateSorted(nums, 0, nums.length);
    }
    private void populateSorted(int[] nums, int start, int end){
//        case of empty array
        if(start>=end){
            return;
        }
        int mid = (start+end)/2;
        insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid+1, end);
    }

//    Tree Traversals
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if (node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.val+" : ");
        inOrder(node.right);
    }

}
