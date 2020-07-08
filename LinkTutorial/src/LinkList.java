public class LinkList {

    private Link first;
    Link current = first;

    public LinkList(){
        first = null;
    }

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        first = first;
    }

    public boolean isEmpty() {
        return first == null;
    }

//    public ListIterator getIterator() {
//        return new ListIterator(this);
//    }

//    public void insertFirst(int id, double dd) {
//        Link newLink = new Link(id, dd);
//        newLink.next = first;
//        first = newLink;
//    }

    public void insertFirst(long dd) {
        Link newLink = new Link(dd);
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(long dd) {
        Link newLink = new Link(dd);

        if (isEmpty()) {
            first = newLink;
            current = first;
        }

        newLink.next = current.next;
        current.next = newLink;
        current = current.next;
        current.next = null;
//        System.out.println(current.next);
    }

    public Link find(int key) {
        Link current = first;

        while (current.iData != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public Link delete(int key) {
        Link current = first;
        Link previous = first;

        while (current.iData != key) {
            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }

        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
        return current;
    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }


    public static void main(String[] args) {
        LinkList newList = new LinkList();
        newList.insertLast(1);
        newList.insertLast(2);
        newList.insertLast(3);
        newList.insertLast(4);
        newList.insertLast(5);

        newList.displayList();
    }
}
