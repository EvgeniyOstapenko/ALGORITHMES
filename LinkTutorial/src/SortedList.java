//
//
//public class SortedList {
//    private Link first;
//
//    public SortedList() {
//        first = null;
//    }
//
//    public SortedList(Link[] linkArr) {
//        first = null;
//        for (int j = 0; j < linkArr.length; j++) {
//            insert(linkArr[j]);
//        }
//    }
//
//    public void insert(Link k) {
//        Link previous = null;
//        Link current = first;
//
//        while (current != null && k.dData > current.dData) {
//            previous = current;
//            current = current.next;
//        }
//
//        if (previous == null) {
//            first = k;
//        } else {
//            previous.next = k;
//        }
//        k.next = current;
//    }
//
//    public Link remove() {
//        Link temp = first;
//        first = first.next;
//        return temp;
//    }
//
//    public void displayList() {
//        Link current = first;
//
//        while (current != null) {
//            System.out.print(current.dData + " ");
//            current = current.next;
//        }
//    }
//
//    public static void main(String[] args) {
//        int size = 5;
//        Link[] linkArray = new Link[size];
//
//        for (int j = 0; j < size; j++) {
//            int n = (int) (java.lang.Math.random() * 99);
//            Link newLink = new Link(n);
//            linkArray[j] = newLink;
//        }
//
//        System.out.print("Unsorted array: ");
//        for (int j = 0; j < size; j++) {
//            System.out.print(linkArray[j].dData + " ");
//        }
//
//        SortedList theSortedList = new SortedList(linkArray);
//
//        System.out.println();
//        theSortedList.displayList();
//
//        System.out.println("/// the smallest element - " + theSortedList.remove().dData);
//
////
////        for (int j = 0; j < size; j++) {
////            linkArray[j] = theSortedList.remove();
////        }
////
////        System.out.print("Sorted Array: ");
////        for (int j = 0; j < size; j++) {
////            System.out.print(linkArray[j].dData + " ");
////        }
//    }
//}
