package implementation;

public class SegmentTrees {


    public static class Node {
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

       private Node root;

//    Method to construct a segment Tree.
        public SegmentTrees(int[] arr) {
//        create segment tree using the array data
            this.root  = constructTree(arr, 0, arr.length-1);
        }

    private Node constructTree(int[] arr, int start, int end) {
            if(start == end){
                Node leaf = new Node(start, end);
                leaf.data = arr[start];
                return leaf;
            }
//          create the node for interval where you are at
            Node node = new Node(start, end);
            int mid  = (start + end)/2;

            node.left = constructTree(arr, start, mid);

//          mid is being assigned to end, on every call.
            node.right = constructTree(arr, mid+1, end);
//          addition Query
            node.data = node.left.data + node.right.data;
            return node;
    }
    public void display(){
            String str= "";
            display(this.root, str);
    }

    private void display(Node node, String str){
            if(node.left != null){
                str += "Left Interval [" + node.left.startInterval+", "+node.left.endInterval +"]: value "+ node.left.data+ " -> ";
            }else{
                str+="No left child -> ";
            }

            str += "Root Interval [" + node.startInterval+", "+node.endInterval +"]: value "+ node.data+ " -> ";

            if(node.right != null){
            str += "Left Interval [" + node.right.startInterval+", "+node.right.endInterval +"]: value "+ node.right.data+ " ";
            }else{
                str+="No right child ";
            }
            System.out.print(str);
            if(node.left != null){
            display(node.left, "\n");
            }
            if(node.right != null){

            display(node.right, "\n");
            }
    }

    public int query(int qsi, int qei){
           return query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei){
        if(node.startInterval>=qsi && node.endInterval<=qei ){
//            completely inside the range
            return  node.data;
        }else if(node.startInterval > qei || node.endInterval< qsi){
//            completely outside the range
            return 0;
        }else {
//            overlapping
            return query(node.left, qsi, qei) + query(node.right, qsi, qei);
        }
    }

    public int update(int index, int value){
            return update(this.root,index, value);
    }

    private int update(Node node, int index, int value) {
            if(node.startInterval<=index && node.endInterval >=index){
                if(node.startInterval==index && node.endInterval==index){
                  node.data = value;
                  return node.data;
                }else{
                    int leftAns = update(node.left, index, value);
                    int rightAns = update(node.right, index, value);
                    node.data = leftAns+rightAns;
                }
            }
            return node.data;
    }

}
