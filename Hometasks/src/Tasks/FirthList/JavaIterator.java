package Tasks.FirthList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class JavaIterator {

    @SuppressWarnings({ "unchecked" })
    public static void main(String []args){
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 2; i++){
            mylist.add(sc.nextInt());
        }
        System.out.println(111111111);
        mylist.add("###");

        for(int i = 0; i < 2; i++){
            mylist.add(sc.next());
        }
        System.out.println(222222222);

        System.out.println(mylist);

        Iterator it = func(mylist);

        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }
    }

    static Iterator func(ArrayList mylist){
        Iterator it = mylist.iterator();
        while(it.hasNext()){
            Object element = it.next();
            if(element instanceof String)
                break;
        }
        System.out.println("iterator - " + it.next());
        return it;

    }
}
