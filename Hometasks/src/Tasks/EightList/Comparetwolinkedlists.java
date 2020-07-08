package Tasks.EightList;

import java.io.IOException;
import java.util.Scanner;

public class Comparetwolinkedlists {
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


    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if(head1 == null || head2 == null){
            if(head1 == head2){
                return true;
            }
            return false;
        }
        if(head1.data != head2.data){
            return false;
        }
        return compareLists(head1.next, head2.next);
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
            SinglyLinkedList list1 = new SinglyLinkedList();
            list1.insertNode(1);
            list1.insertNode(2);
//            list1.insertNode(3);


            SinglyLinkedList list2 = new SinglyLinkedList();
            list2.insertNode(1);
//            list2.insertNode(2);
//            list2.insertNode(3);

            boolean result = compareLists(list1.head, list2.head);
            System.out.println((result ? 1 : 0));
            scanner.close();
    }
}
