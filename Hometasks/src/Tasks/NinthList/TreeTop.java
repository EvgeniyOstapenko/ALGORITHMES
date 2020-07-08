package Tasks.NinthList;

import java.util.*;

public class TreeTop {

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
    public static void topView(Node root) {
        Dictionary<Node, Integer> dictionary = new Hashtable<>();
        Map<Integer, Node> topResult = new TreeMap<>();
        Queue<Node> nodes = new LinkedList<>();

        if (root != null) {
            topResult.put(0, root);
            dictionary.put(root, 0);
            nodes.add(root);
        }

        while (!nodes.isEmpty()) {
            Node current = nodes.remove();
            int currentOrder = dictionary.get(current);

            if (current.left != null) {
                int value = currentOrder-1;

                if (!topResult.containsKey(value)) {
                    topResult.put(value, current.left);
                }
                dictionary.put(current.left, value);
                nodes.add(current.left);
            }

            if (current.right != null) {
                int value = currentOrder+1;

                if (!topResult.containsKey(value)) {
                    topResult.put(value, current.right);
                }
                dictionary.put(current.right, value);
                nodes.add(current.right);
            }
        }

        for (Node node : topResult.values()) {
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        TreeTop.Node root   = new TreeTop.Node(2);
        TreeTop.Node node7  = new TreeTop.Node(7);
        TreeTop.Node node5  = new TreeTop.Node(5);
        TreeTop.Node node2  = new TreeTop.Node(2);
        TreeTop.Node node6  = new TreeTop.Node(6);
        TreeTop.Node node9  = new TreeTop.Node(9);
        TreeTop.Node node5_ = new TreeTop.Node(5);
        TreeTop.Node node11 = new TreeTop.Node(11);
        TreeTop.Node node4  = new TreeTop.Node(4);

        root.left = node7;
        root.right = node5;

        node7.left = node2;
        node7.right = node6;

        node6.left = node5_;
        node6.right = node11;

        node5.right = node9;
        node9.left = node4;

        topView(root);
    }
}
