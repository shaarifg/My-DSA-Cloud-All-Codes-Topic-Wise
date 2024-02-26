package implementation;

import java.util.Scanner;

public class BinaryTree {
    private BinaryNode node;
    private BinaryNode root;


//    take input in tree
    public void takeInput(){
        Scanner sc = new Scanner(System.in);
        if(root == null){
            System.out.print("Enter root data: ");
            int data = sc.nextInt();
            this.root = new BinaryNode(data);
        }
        takeInput(this.root);
    }


//    revcu
    private void takeInput(BinaryNode node){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter left of "+ node.data+" if no enter -1: ");
        int val = sc.nextInt();
        if(val != -1){
            node.left = new BinaryNode(val);
            takeInput(node.left);
        }
        System.out.print("Enter right of "+ node.data+" if no enter -1: ");
        int value = sc.nextInt();
        if(value !=-1){
            node.right = new BinaryNode(value);
            takeInput(node.right);
        }
    }

    public void display(){
        display(this.root);
    }
    private void display(BinaryNode node){
        if (node==null){
            return;
        }
        System.out.print(node.data +" | ");
        display(node.left);
        display(node.right);
    }

    public void displayBetter(){
        displayBetter(this.root,0);
    }
    private void displayBetter(BinaryNode node, int level){
        if (node == null){
            return;
        }
        displayBetter(node.right, level+1);
        if(level!=0){

//            adding spaces for formatting
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->"+node.data);
        }else {
            System.out.println(node.data);
        }
        displayBetter(node.left, level+1);
    }
}
