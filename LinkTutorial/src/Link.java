public class Link {

    public int iData;
    public double dData;
//    public long dData;
    public Link next;
    public Link previous;


    public Link(long dd) {
        dData = dd;
    }



//    public Link(int id, double dd) {
//        iData = id;
//        dData = dd;
//    }
//
    public Link(double d) {
        iData = 0;
        dData = d;
    }

    public void displayLink() {
//        if (iData != 0) {
//            System.out.println("{" + iData + ", " + dData + "}");
//        } else {
            System.out.print(dData + " ");
//        }

    }
}
