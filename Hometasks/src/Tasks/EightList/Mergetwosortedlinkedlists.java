package Tasks.EightList;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Mergetwosortedlinkedlists {

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

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1,
                                           SinglyLinkedListNode head2) {
        if(head1 == null) return head2;
        if(head2 == null) return head1;

        if(head1.data < head2.data){
             head1.next = mergeLists(head1.next, head2);
             return head1;
        }else {
             head2.next = mergeLists(head1, head2.next);
             return head2;
        }
    }

    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.insertNode(1);
        list1.insertNode(3);
        list1.insertNode(6);

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.insertNode(1);
        list2.insertNode(6);
        list2.insertNode(7);
        list2.insertNode(8);

        SinglyLinkedListNode list3 = mergeLists(list1.head, list2.head);
        printSinglyLinkedList(list3);

        scanner.close();
    }
}
