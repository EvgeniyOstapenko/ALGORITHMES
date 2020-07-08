package Tasks.EightList;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RecursiveReverseList {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    static SinglyLinkedListNode reverse(SinglyLinkedListNode node) {
        if (node.next == null){
            return node;
        }


        SinglyLinkedListNode l_node = reverse(node.next);
        SinglyLinkedListNode last_node = new SinglyLinkedListNode(l_node.data);

        SinglyLinkedListNode new_node = new SinglyLinkedListNode(node.data);
        last_node.next = new_node;
        System.out.println(l_node.data);
        return new_node;
    }

    static int index = 0;
    static int length = 0;
    static int answer = -1;
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        if (head.next != null) {
            index++;
            length++;
            getNode(head.next, positionFromTail);
        }
        if(positionFromTail == (length - index)){
            index--;
            answer = head.data;
        }
        index--;
        return answer;
    }



    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
           if(head.next != null) {

               if (head.data == head.next.data) {
                   head.next = head.next.next;
                   removeDuplicates(head);
               }else{
                   removeDuplicates(head.next);
               }
           }
           return head;
    }

    static int count = 2;
    static boolean hasCycle(SinglyLinkedListNode head) {
        if(head == null){
            return false;
        }

        if(--count == 0) return true;

        System.out.println(count);
        return hasCycle(head.next);

    }

    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode current_head1 = head1;
        SinglyLinkedListNode current_head2 = head2;

        while(current_head1 != current_head2){
            if(current_head1.next == null){
                current_head1 = head2;
            }else{
                current_head1 = current_head1.next;
            }

            if(current_head2.next == null){
                current_head2 = head1;
            }else{
                current_head2 = current_head2.next;
            }
        }

        return current_head1.data;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(String.valueOf(System.in)));

        SinglyLinkedListNode node = new SinglyLinkedListNode(3);


        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.insertNode(1);
        list1.insertNode(2);

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.insertNode(1);


        System.out.println(findMergeNode(list1.head, list2.head));


//        printSinglyLinkedList(reversed_list);
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
        scanner.close();
    }
}


//    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
//        if(head == null) return head;
//
//        SinglyLinkedListNode current_node = head;
//        SinglyLinkedListNode next_node = null;
//        SinglyLinkedListNode prev_node = null;
//
//        while(current_node != null){
//            next_node = current_node.next;
//
//            current_node.next = prev_node;
//            prev_node = current_node;
//
//            current_node = next_node;
//        }
//
//        return prev_node;
//    }


//    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
//        if (head.next == null){
//            return head;
//        }
//        SinglyLinkedListNode new_head = reverse(head.next);
//
//        head.next.next = head;
//        head.next = null;
//        return new_head;
//    }

//    static int answer;
//    static int length;
//    static int getNode(SinglyLinkedListNode head, int position) {
//        genNodeHelper(head, position, 0);
//        return answer;
//    }
//
//    static void genNodeHelper(SinglyLinkedListNode head, int position, int index){
//        if(head == null) {
//            length = index - 1;
//        }else {
//            genNodeHelper(head.next, position, index + 1);
//        }
//
//        if(length - position == index) {
//            answer = head.data;
//        }
//    }