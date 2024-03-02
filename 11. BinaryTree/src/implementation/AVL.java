package implementation;

public class AVL {
//    kind of self-balancing binary tree

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
        return rotate(node);
    }

    private Node rotate(Node node){
        if(height(node.left)-height(node.right)>1){
//            left heavy
//            left-left case
            if(height(node.left.left)-height(node.left.right)>0){
                return rightRotate(node);
            }
//            left-right case
            if(height(node.left.left)-height(node.left.right)<0){
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }

        }
        if(height(node.left)-height(node.right)<-1){
//            right heavy
          if(height(node.right.left)-height(node.right.right)<0){
//                right-right case
                return leftRotate(node);
            }
            if(height(node.right.left)-height(node.right.right)>0){
//                right-right case
                node.right = rightRotate(node.right);
               return leftRotate(node);
            }

        }
        return node;
    }

    private Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;
//        after changing the structure the
        p.height=  Math.max(height(p.left), height(p.right)+1);
        c.height = Math.max(height(c.left), height(c.right)+1);
        return p;
    }

    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;
//         after changing the structure the

        p.height=  Math.max(height(p.left), height(p.right)+1);
        c.height = Math.max(height(c.left), height(c.right)+1);
        return c;
    }

    public int height(){
        return height(root);
    }
    //    calculation of height of the tree
    private int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public void display(){
        if(root==null){
            System.out.println("BST is Empty");
            return;
        }
//        System.out.println("Root Node: " +root.val);
        display(root,"Root Node: ");
    }
    private void display(Node node, String info){
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

}
