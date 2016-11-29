/**
 * Created by Lizzi on 29.11.2016.
 */
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Arrays;

public class test {
    public test() {
    }

    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint(1, 1);
        MyPoint myPoint1 = new MyPoint(1, 2);
        MyPoint myPoint2 = new MyPoint(1, 3);
        MyPoint myPoint3 = new MyPoint(1, 4);
        MyPoint myPoint4 = new MyPoint(1, 5);
        MyPoint myPoint5 = new MyPoint(1, 6);
        new MyPoint(1, 7);
        new MyPoint(1, 8);
        new MyPoint(1, 9);
        new MyPoint(1, 10);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myPoint);
        myLinkedList.add(myPoint1);
        myLinkedList.add(myPoint2);
        myLinkedList.add(myPoint3);
        myLinkedList.add(myPoint4, 0);
        myLinkedList.add(myPoint5, 0);
        System.out.println(myLinkedList.size());
        System.out.println("head");
        System.out.println(myLinkedList.toString());
        System.out.println(((MyPoint)myLinkedList.showHead()).toString());
        System.out.println(Arrays.toString(myLinkedList.toArray()));
    }
}
