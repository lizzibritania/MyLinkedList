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
        MyPoint myPoint6 = new MyPoint(1, 7);
        MyPoint myPoint7 = new MyPoint(1, 8);
        MyPoint myPoint8 = new MyPoint(1, 9);
        MyPoint myPoint9 = new MyPoint(1, 10);
        MyLinkedList<MyPoint> myLinkedList = new MyLinkedList();

        myLinkedList.add(myPoint);

        myLinkedList.add(myPoint1);
        myLinkedList.add(myPoint2);

        myLinkedList.add(myPoint3);
        myLinkedList.add(myPoint4, 0);
        myLinkedList.add(myPoint5, 0);

        System.out.println(myLinkedList.size());


        System.out.println("head");
        System.out.println(myLinkedList.toString());
        System.out.println(myLinkedList.showHead().toString());
        System.out.println(myLinkedList.showHead());


        System.out.println("Estimated time for add(Object element) method of myLinkedList");
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            myLinkedList.add(myPoint1);
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);
        LinkedList linkedList = new LinkedList();
        System.out.println("Estimated time for add(Object element) method of java.itil.LinkedList");

        long startTime1 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(myPoint1);
        }
        long estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println(estimatedTime1);
    }
}