package Tasks.NinthList;

import java.util.Scanner;

public class BinarySearchTreeInsertion {
    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void preOrder( Node root ) {
        if( root == null)
            return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void print(Node root ) {
        if( root == null)
            return;

        System.out.print(root.data + " ");
        print(root.right);
    }

    public static Node insert1(Node root,int data) {

        if(root.data > data){
            if(root.left != null) insert1(root.left, data);
            else root.left = new Node(data);
        }else{
            if(root.right != null) insert1(root.right, data);
            else root.right = new Node(data);
        }
        return root;
    }

    static Node insert2(Node root,int value){
        if (root != null){
            if (root.data < value){
                root.left = insert2(root.left, value);
            }
            else {
                root.right = insert2(root.right, value);
            }
        }
        else {
            root = new Node(value);
            root.left = root.right = null;
        }
        return root;
    }

    static Node insert3(Node root,int value){
        Node head = root;
        Node node = new Node(value);
        if(root == null) return node;
        while(root.left != null || root.right != null){
            while(value > root.data && root.right != null){
                root = root.right;
            }
            while(value < root.data && root.left != null){
                root = root.left;
            }
        }
        if(root.data > value){root.left = node;}
        else{root.right = node;}
        return head;
    }

    public static Node insert4(Node root,int data) {
        if(root == null){
            root = new Node(data);
            return root;

        }if(data < root.data){
            root.left = insert4(root.left, data);
        }
        else if(data > root.data){
            root.right = insert4(root.right, data);
        }
        return root;
    }

    public static void main(String[] args) {
        Node root   = new Node(4);
        Node node2  = new Node(2);
        Node node7  = new Node(7);
        Node node1  = new Node(1);
        Node node3  = new Node(3);


        root.left = node2;
        root.right = node7;

        node2.left = node1;
        node2.right = node3;



        //4 2 1 3 7 6
//        insert1(root, 6);
//        preOrder(root);
//        System.out.println();
//        System.out.println(root.data);

//        insert2(root, 6);
//        preOrder(root);
//
//        insert3(root, 6);
//        preOrder(root);
//
        insert4(root, 6);
        preOrder(root);
        System.out.println();
        System.out.println(root.data);

//        print(root);
//        preOrder(root);
    }

}
