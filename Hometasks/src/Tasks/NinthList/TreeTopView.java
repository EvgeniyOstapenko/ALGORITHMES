package Tasks.NinthList;


import java.util.*;

public class TreeTopView {
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


    public static List<Node> levelSearch(Node root) {
        List<Node> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node tempNode = queue.poll();
            list.add(tempNode);
//            System.out.println(tempNode.data);

            if(tempNode.left != null)
                queue.add(tempNode.left);
            if(tempNode.right != null)
                queue.add(tempNode.right);
        }
        return list;
    }

    static Map<Node, Integer> map = new HashMap();
    public static void countDepth(Node node, int depth) {
        map.put(node, depth);
//        System.out.println(node.data + " - " + depth);

        if(node.left != null){
            int new_depth = depth - 1;
            countDepth(node.left, new_depth);
        }
        if(node.right != null){
            int new_depth = depth + 1;
            countDepth(node.right, new_depth);
        }
    }

    public static void topView(Node root) {
        List list_nodes = levelSearch(root);
        countDepth(root, 0);

        ArrayList<Integer> answers = new ArrayList();
        List<Integer> checker = new ArrayList();
        Map<Integer, Node> new_map = new HashMap();
        for (int i = 0; i < list_nodes.size(); i++) {
            Node node = (Node) list_nodes.get(i);
            int depth = map.get(node);
            if(!checker.contains(depth)){
                checker.add(depth);
                new_map.put(depth, node);
            }
        }
        Collections.sort(checker);
        for (int i = 0; i < checker.size(); i++) {
            int index = checker.get(i);
            System.out.print(new_map.get(index).data + " ");
        }
    }

    public static void main(String[] args) {
        Node root   = new Node(2);
        Node node7  = new Node(7);
        Node node5  = new Node(5);
        Node node2  = new Node(2);
        Node node6  = new Node(6);
        Node node9  = new Node(9);
        Node node5_ = new Node(5);
        Node node11 = new Node(11);
        Node node4  = new Node(4);

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

