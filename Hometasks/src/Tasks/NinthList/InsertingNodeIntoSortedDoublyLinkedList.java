package Tasks.NinthList;

public class InsertingNodeIntoSortedDoublyLinkedList {

    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    static class DoublyLinkedList {
        public DoublyLinkedListNode head;
        public DoublyLinkedListNode tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
                node.prev = this.tail;
            }

            this.tail = node;
        }
    }

    public static void printDoublyLinkedList(DoublyLinkedListNode node){
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
//            node = node.prev;
        }
    }

    static DoublyLinkedListNode sortedInsert1(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode current_node = head;
        DoublyLinkedListNode new_node = new DoublyLinkedListNode(data);
        if(current_node == null){
            return new_node;
        }
        while(current_node.next != null && current_node.data < data && current_node.next.data < data){
              current_node = current_node.next;
        }
        if(current_node.data > data){
            current_node.prev = new_node;
            new_node.next = current_node;
            return new_node;
        }else  if(current_node.next != null) {
           DoublyLinkedListNode temp = current_node.next;
           new_node.next = temp;
           temp.prev = new_node;
        }
        current_node.next = new_node;
        new_node.prev = current_node;

        return head;
    }

    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        if(head == null) return new DoublyLinkedListNode(data);

        if(head.data > data){
            DoublyLinkedListNode new_node = new DoublyLinkedListNode(data);
            new_node.next = head;
            head.prev = new_node;
            return new_node;
        }else {
            DoublyLinkedListNode rest = sortedInsert(head.next, data);
            head.next = rest;
            rest.prev = head;
        }
        return head;
    }


    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {

        DoublyLinkedListNode temp = head.next;
        head.next = head.prev;
        head.prev = temp;

        if (temp == null) return head;
        return reverse(temp);
    }

    static DoublyLinkedListNode reverse1(DoublyLinkedListNode curr) {

        DoublyLinkedListNode temp = curr.next;
        curr.next = curr.prev;
        curr.prev = temp;

        return temp == null ? curr : reverse1(temp);
    }

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();
        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(4);

        DoublyLinkedListNode head = reverse(list.head);
        printDoublyLinkedList(head);

    }
}
