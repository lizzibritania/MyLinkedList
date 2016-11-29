/**
 * Created by Lizzi on 29.11.2016.
 */
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.ArrayList;
import java.util.LinkedList;

public class TestUtil {
    public TestUtil() {
    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        MyPoint myPoint1 = new MyPoint(1, 2);
        System.out.println("Estimated time for add(Object element) method of java.itil.ArrayList");
        long startTime = System.nanoTime();

        for(int estimatedTime = 0; estimatedTime < 100000; ++estimatedTime) {
            arrayList.add(myPoint1);
        }

        long var16 = System.nanoTime() - startTime;
        System.out.println(var16);
        System.out.println("Estimated time for add(Object element) method of java.itil.LinkedList");
        long startTime1 = System.nanoTime();

        for(int estimatedTime1 = 0; estimatedTime1 < 100000; ++estimatedTime1) {
            linkedList.add(myPoint1);
        }

        long var17 = System.nanoTime() - startTime1;
        System.out.println(var17);
        long startTime2 = System.nanoTime();

        for(int estimatedTime2 = 0; estimatedTime2 < 100000; ++estimatedTime2) {
            linkedList.add(myPoint1);
        }

        long var18 = System.nanoTime() - startTime2;
        System.out.println(var18);
    }
}
