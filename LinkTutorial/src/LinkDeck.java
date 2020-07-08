//import java.util.Scanner;
//
//public class LinkDeck {
//    DoublyLinkedList theList;
//
//    public LinkDeck() {
//        theList = new DoublyLinkedList();
//    }
//
//    public void push(long n) {
//        theList.insertFirst(n);
//    }
//
//    public long pop() {
//        return theList.deleteFirst().dData;
//    }
//
//    public long peek() {
//        return theList.displayFirst();
//    }
//
//    public boolean isEmpty() {
//        return theList.isEmpty();
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        LinkDeck linkDeck = new LinkDeck();
//
//        while (true) {
//            long number = scanner.nextLong();
//
//            if (number == 0) {
//                break;
//            }
//
//            linkDeck.push(number);
//        }
//
//        while (!linkDeck.isEmpty()) {
//            System.out.print( linkDeck.pop());
//        }
//
//
//
//    }
//}
