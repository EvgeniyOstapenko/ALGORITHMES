package Tasks.NinthList;

import java.util.Scanner;

import static Tasks.NinthList.TreePreorderTraversal.Solution.height;

public class TreePreorderTraversal {
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

    static class Solution {
        public static void preOrder(Node root) {
            if (root == null) return;
            System.out.print(root.data + " ");

            preOrder(root.left);
            preOrder(root.right);

        }

        public static void postOrder(Node root) {
            if (root == null) return;
            postOrder(root.left);
            postOrder(root.right);

            System.out.print(root.data + " ");
        }

        public static int height(Node root) {
            if(root == null) return -1;

            int left = height(root.left);
            int right = height(root.right);

            if (left > right) {
                return left + 1;
            } else {
                return right + 1;
            }
        }
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
//        Solution.postOrder(root);
        int height = height(root);
        System.out.println(height);
    }
}

