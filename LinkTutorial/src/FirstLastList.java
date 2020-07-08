//import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
//
//public class FirstLastList {
//    private Link first;
//    private Link last;
//
//    public FirstLastList() {
//        first = null;
//        last = null;
//    }
//
//    public boolean isEmpty() {
//        return first == null;
//    }
//
//    public void insertFirst(long dd) {
//        Link newLink = new Link(dd);
//        if (isEmpty()) {
//            last = newLink;
//        }
//        newLink.next = first;
//        first = newLink;
//    }
//
//    public void insertLast(long dd) {
//        Link newLink = new Link(dd);
//        if (isEmpty()) {
//            first = newLink;
//        } else {
//            last.next = newLink;
//            last = newLink;
//        }
//    }
//
//    public double deleteFirst() {
//        double temp = first.dData;
//        if (first.next == null) {
//            last = null;
//        }
//        first = first.next;
//        return temp;
//    }
//
//    public void displayList() {
//        System.out.println("List (first --> last); ");
//        Link current = first;
//        while (current != null) {
//            current.displayLink();
//            current = current.next;
//        }
//        System.out.println("");
//    }
//
//    public static void main(String[] args) {
//        FirstLastList theList = new FirstLastList();
//        theList.insertFirst(22);
//        theList.insertFirst(44);
//        theList.insertFirst(66);
//
//        theList.insertLast(11);
//        theList.insertLast(33);
//        theList.insertLast(55);
//
//        theList.insertFirst(22);
//        theList.insertFirst(44);
//        theList.insertFirst(66);
//
//        theList.displayList();
//
////        theList.deleteFirst();
////        theList.deleteFirst();
////
////        theList.displayList();
//    }
//
//
//
//
//
//}
//
//
//
//
//
//
//
//
