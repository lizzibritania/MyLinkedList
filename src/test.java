import java.util.Arrays;
import java.util.Iterator;
import  java.util.*;
/**
 * Created by Lizzi on 27.11.2016.
 */
public class test {

    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint(1, 1);
        MyPoint myPoint1 = new MyPoint(1, 2);
        MyPoint myPoint2 = new MyPoint(1, 3);
        MyPoint myPoint3 = new MyPoint(1, 4);
        MyPoint myPoint4 = new MyPoint(1, 5);
        MyPoint myPoint5 = new MyPoint(1, 6);

        MyLinkedList<MyPoint> myLinkedList = new MyLinkedList();

        myLinkedList.add(myPoint);
        myLinkedList.add(myPoint1);
        myLinkedList.add(myPoint2);
        myLinkedList.add(myPoint3);
        myLinkedList.add(myPoint4, 0);
        myLinkedList.add(myPoint5, 0);
        System.out.println("Size of myList = "+myLinkedList.size());



        System.out.println("My linked list toString: ");
        System.out.println(myLinkedList.toString());

        System.out.println("get(0)");
        System.out.println(myLinkedList.get(0));
        System.out.println("get (5), we numerate from 0");
        System.out.println(myLinkedList.get(5));
        System.out.println("Index of new MyPoint(1,2), numerating from 0");
        System.out.println(myLinkedList.indexOf(new MyPoint(1,2)));
        System.out.println("We set 1 element - new MyPoint(1,999)");
        myLinkedList.set(1,new MyPoint(1,999));
        System.out.println(myLinkedList.toString());
        System.out.println("then detete it");
        myLinkedList.remove(1);
        System.out.println(myLinkedList.toString());
        System.out.println("index of element myPoint= (1,1,) = "+ myLinkedList.indexOf(myPoint));


        System.out.println("work of iterator. next and iterator.hasNext");

        Iterator myiterator=myLinkedList.iterator();
        System.out.println(myiterator.hasNext());
        System.out.println(myiterator.next());
        System.out.println(myiterator.hasNext());
        System.out.println(myiterator.next());
        System.out.println(myiterator.hasNext());
        System.out.println(myiterator.next());
        System.out.println(myiterator.hasNext());
        System.out.println(myiterator.next());
        System.out.println(myiterator.hasNext());
        System.out.println(myiterator.next());
        System.out.println(myiterator.hasNext());
        System.out.println(myiterator.next());
        System.out.println(myiterator.hasNext());
        System.out.println(myiterator.next());
        System.out.println(myiterator.hasNext());
        System.out.println(myiterator.next());
        System.out.println(myLinkedList.toString());
        System.out.println("to Array");
        System.out.println(Arrays.toString(myLinkedList.toArray()));


        LinkedList linkedList = new LinkedList();
        System.out.println("Estimated time for add(Object element) method of java.itil.LinkedList");
        System.out.println(myLinkedList.toString());
        long startTime1 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(myPoint1);
        }
        long estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println(estimatedTime1);

        System.out.println("Estimated time for add(Object element) method of myLinkedList");
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(myPoint1);
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);

       System.out.println("Estimated time for set method of java.itil.LinkedList");

    long startTime3 = System.nanoTime();

        linkedList.set(5000,myPoint1);

    long estimatedTime3 = System.nanoTime() - startTime3;
        System.out.println(estimatedTime3);

        System.out.println("Estimated time for set method of myLinkedList");
    long startTime4 = System.nanoTime();

        linkedList.set(5000,myPoint1);

    long estimatedTime4 = System.nanoTime() - startTime4;
        System.out.println(estimatedTime4);


        System.out.println("Estimated time for remove method of java.itil.LinkedList");

        long startTime6= System.nanoTime();

            linkedList.set(5000,myPoint1);

        long estimatedTime6 = System.nanoTime() - startTime6;
        System.out.println(estimatedTime6);

        System.out.println("Estimated time for remove method of myLinkedList");
        long startTime7 = System.nanoTime();

            linkedList.set(5000,myPoint1);

        long estimatedTime7 = System.nanoTime() - startTime7;
        System.out.println(estimatedTime7);





}}