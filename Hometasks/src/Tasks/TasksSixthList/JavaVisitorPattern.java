//package Tasks.TasksSixthList;
//
//
//import java.util.*;
//
//enum Color {
//        RED, GREEN
//    }
//
//    abstract class Tree {
//
//        private int		value;
//        private Color	color;
//        private int		depth;
//
//        public Tree(int value, Color color, int depth) {
//            this.value = value;
//            this.color = color;
//            this.depth = depth;
//        }
//
//        public int getValue() {
//            return value;
//        }
//
//        public Color getColor() {
//            return color;
//        }
//
//        public int getDepth() {
//            return depth;
//        }
//
//        public abstract void accept( TreeVis visitor );
//    }
//
//     class TreeNode extends Tree {
//
//        private ArrayList<Tree> children = new ArrayList<>();
//
//        public TreeNode(int value, Color color, int depth) {
//            super( value, color, depth );
//        }
//
//        public void accept( TreeVis visitor ) {
//            visitor.visitNode( this );
//
//            for ( Tree child : children ) {
//                System.out.println("Child - " + child.getDepth());
//                child.accept( visitor );
//            }
//        }
//
//        public void addChild( Tree child ) {
//            children.add( child );
//        }
//
//         public ArrayList<Tree> getChildren() {
//             return children;
//         }
//     }
//
//    class TreeLeaf extends Tree {
//
//        public TreeLeaf(int value, Color color, int depth) {
//            super( value, color, depth );
//        }
//
//        public void accept( TreeVis visitor ) {
//            visitor.visitLeaf( this );
//        }
//    }
//
//    abstract class TreeVis {
//        public abstract int getResult();
//        public abstract void visitNode( TreeNode node );
//        public abstract void visitLeaf( TreeLeaf leaf );
//    }
//
//    class SumInLeavesVisitor extends TreeVis {
//        private int result = 0;
//
//        public int getResult() {
//            return result;
//        }
//
//        public void visitNode(TreeNode node) {
//            // do nothing
//        }
//
//        public void visitLeaf(TreeLeaf leaf) {
//            result += leaf.getValue();
//        }
//    }
//
//    class ProductOfRedNodesVisitor extends TreeVis {
//        private long result = 1;
//        private final int M = 1000000007;
//
//        public int getResult() {
//            return (int) result;
//        }
//
//        public void visitNode(TreeNode node) {
//            if (node.getColor() == Color.RED) {
//                result = (result * node.getValue()) % M;
//            }
//        }
//
//        public void visitLeaf(TreeLeaf leaf) {
//            if (leaf.getColor() == Color.RED) {
//                result = (result * leaf.getValue()) % M;
//            }
//        }
//    }
//
//    class FancyVisitor extends TreeVis {
//        private int nonLeafEvenDepthSum = 0;
//        private int greenLeavesSum = 0;
//
//        public int getResult() {
//            return Math.abs(nonLeafEvenDepthSum - greenLeavesSum);
//        }
//
//        public void visitNode(TreeNode node) {
//            if (node.getDepth() % 2 == 0) {
//                nonLeafEvenDepthSum += node.getValue();
//            }
//        }
//
//        public void visitLeaf(TreeLeaf leaf) {
//            if (leaf.getColor() == Color.GREEN) {
//                greenLeavesSum += leaf.getValue();
//            }
//        }
//    }
//
//     class Solution {
//        private static int [] values;
//        private static Color [] colors;
//        private static HashMap<Integer, Set<Integer>> map;
//
//        public static Tree solve() {
//            Scanner scan = new Scanner(System.in);
//            int numNodes = scan.nextInt();
//
//            /* Read and save nodes and colors */
//            values = new int[numNodes];
//            colors = new Color[numNodes];
//            map = new HashMap<>(numNodes);
//            for (int i = 0; i < numNodes; i++) {
//                values[i] = scan.nextInt();
//            }
//            for (int i = 0; i < numNodes; i++) {
//                colors[i] = scan.nextInt() == 0 ? Color.RED : Color.GREEN;
//            }
//
//            /* Save edges */
//            for (int i = 0; i < numNodes - 1; i++) {
//                 int u = scan.nextInt();
//                 int v = scan.nextInt();
//
//                 int count = 2;
//                 while (count-- > 0) {
//                     Set listOfChildren = map.get(u);
//                     if (listOfChildren == null) {
//                         listOfChildren = new HashSet();
//                         map.put(u, listOfChildren);
//                     }
//                     if (u < v) {
//                         listOfChildren.add(v);
//                     }
//                     int val = u;
//                     u = v;
//                     v = val;
//                 }
//            }
//            System.out.println(map);
//
//            List<Tree> listOfNodes = new ArrayList<>();
//            int depth = 0;
//            TreeNode root = new TreeNode(values[0] ,colors[0],depth);
//            listOfNodes.add(root);
//            System.out.println("root - " + values[0] + " with depth - " + depth);
//            for (int i = 1; i <= map.size(); i++){
//                if(!map.get(i).isEmpty()){
//                    depth++;
//                }
//                for (Integer node : map.get(i)) {
//                    if(map.get(node).isEmpty()){
//                        TreeLeaf leaf = new TreeLeaf(values[node - 1], colors[node - 1], depth);
//                        listOfNodes.add(leaf);
//                        System.out.println("leaf - " + values[node - 1] + " with depth - " + depth);
//                    }else {
//                        TreeNode treeNode = new TreeNode(values[node - 1], colors[node - 1], depth);
//                        listOfNodes.add(treeNode);
//                        System.out.println("common node - " + values[node - 1] + " with depth - " + depth);
//                    }
//                }
//            }
//            for (int i = 1; i <= map.size(); i++) {
//                if(!map.get(i).isEmpty()){
//                   Tree parent =  listOfNodes.get(i - 1);
//                    for (Integer child : map.get(i)) {
//                        ((TreeNode)parent).addChild(listOfNodes.get(child - 1));
//                    }
//                }
//            }
//            return root;
//        }
//
//        public static void main( String[] args ) {
////            TreeNode root = (TreeNode) solve();
////            for (Tree child : root.getChildren()) {
////
////            }
//            Tree root = (TreeNode) solve();
//            SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
//            ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
//            FancyVisitor vis3 = new FancyVisitor();
//
//            root.accept(vis1);
////            root.accept(vis2);
////            root.accept(vis3);
//
//            int res1 = vis1.getResult();
////            int res2 = vis2.getResult();
////            int res3 = vis3.getResult();
//
//            System.out.println( res1 );
////            System.out.println( res2 );
////            System.out.println( res3 );
//        }
//    }
//
//
//
//
