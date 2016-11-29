/**
 * Created by Юля on 29.11.2016.
 */
import java.util.*;
public class TestUtil {
    public static void main(String[] args) {


        ArrayList arrayList=new ArrayList();
        LinkedList linkedList=new LinkedList();

        MyPoint myPoint1 = new MyPoint(1, 2);
        System.out.println("Estimated time for add(Object element) method of java.itil.ArrayList");
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(myPoint1);
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);

        System.out.println("Estimated time for add(Object element) method of java.itil.LinkedList");
        long startTime1 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(myPoint1);
        }
        long estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println(estimatedTime1);

        long startTime2 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(myPoint1);
        }
        long estimatedTime2 = System.nanoTime() - startTime2;
        System.out.println(estimatedTime2);
    }



}