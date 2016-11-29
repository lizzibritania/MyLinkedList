/**
 * Created by Lizzi on 29.11.2016.
 */

public interface ILinkedList<E> extends Iterable<E> {
    void add(E var1);

    void add(E var1, int var2);

    void clear();

    E get(int var1);

    int indexOf(E var1);

    E remove(int var1);

    E set(int var1, E var2);

    int size();

    E[] toArray();

    String toString();
}
