package task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(100);

        ListIterator <Integer> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()){
            Integer integer = listIterator.next() + 1;
            System.out.println(integer);
        }
    }
}
