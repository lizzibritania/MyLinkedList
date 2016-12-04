//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Iterator;

public class MyLinkedList<E> implements ILinkedList {
    private Node<E> head;
    private Node<E> tail;
    private Node<E> cnode;
    protected int size;
    MyLinkedList<E> myLinkedListIter;

    public MyLinkedList() {
        this.cnode = this.head;
        this.size = 0;
        this.myLinkedListIter = this;
    }

    public E showHead() {
        return this.head.getElement();
    }

    public void add(Object element) {
        if (this.cnode != null) {
            Node newNode = new Node(element, this.cnode.getNextNode());
            this.cnode.setNextNode(newNode);
            this.cnode = newNode;
        } else {
            this.head = this.tail = new Node(element, (Node) null);
            this.cnode = this.head;
        }

        ++this.size;
    }

    public String toString() {
        String str = "";
        if (this.head != null) {
            str = str + this.head.getElement();

            for (Node current = this.head.getNextNode(); current != null; current = current.getNextNode()) {
                str = str + ", " + current.getElement();
            }
        }

        return str;
    }

    public void add(Object element, int index) {
        Node cur;
        if (index == 0) {
            cur = new Node(element, this.head, (Node) null);
            this.head = cur;
            ++this.size;
        } else if (index > this.size) {
            this.add(element);
        } else {
            cur = this.head;

            for (int newnode = 0; newnode < index - 1; ++newnode) {
                cur = cur.getNextNode();
            }

            Node var5 = new Node(element, cur.getNextNode(), cur.getPrevNode());
            cur.setNextNode(var5);
            ++this.size;
        }

    }

    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Object get(int index) {
        Node result = this.head;
        if (index >= this.size) {
            System.out.println("No such element");
            return null;
        } else {
            for (int i = 0; i < index; ++i) {

                result = result.getNextNode();
            }

            return result.getElement();
        }
    }

    public int indexOf(Object element) {
        int index = 0;
        Node result = head;
        while (result != null) {
            if (result.getElement().equals(element)) {
                {
                    return index;
                }
            }
            index++;
            result = result.getNextNode();
        }
        return -1;
    }


    public Object remove(int index) {
        Node deleted = head;
        Node current = head;
        if (size == 1) {
            head = null;
            tail = null;
            size--;
            return true;
        }
        if (index == 0) {
            head.setElement(head.getNextNode().getElement());
            head = head.getNextNode();
            size--;
            return true;
        }
        if (head == null) {
            return false;
        }


        if (index > size) {
            System.out.println("out of bounds");
            return false;
        } else {
            for (int i = 0; i < index - 1; i++) {
                current = current.getNextNode();
            }
            for (int i = 0; i < index + 1; i++) {
                deleted = deleted.getNextNode();
            }

            deleted.setPrevNode(current);
            current.setNextNode(deleted);

            size--;
        }
        return true;
    }


    public E set(int index, Object element) {
        Node cur;
        if (index == 0) {
            head.setElement((E) element);

        } else if (index > this.size) {
            System.out.println("out of bounds");
        } else {
            cur = this.head;

            for (int newnode = 0; newnode < index; ++newnode) {
                cur = cur.getNextNode();
            }


            Node var5 = new Node(element, cur.getNextNode(), cur.getPrevNode());
            cur.setElement(var5.getElement());
        }
        return null;

    }

    public int size() {
        return this.size;
    }

    public Object[] toArray() {

        Node<E> lastr = head;
        Node<E> nextnode;

        Object[] objects = new Object[this.size];
objects[0]=lastr.getElement();
        for (int i = 1; i < this.size; ++i) {
            nextnode = lastr.getNextNode();

            lastr = nextnode;

            objects[i] = lastr.getElement();

        }


        return objects;
    }

    public Iterator iterator() {
        return new MyLinkedListIterator();}

        private class MyLinkedListIterator implements Iterator<E>
        {
            private Node<E> lastReturned = head;
      private Node<E> next;
       private int nextIndex;
            private String no="no such element";


            public boolean  hasNext() {
                        return lastReturned.getNextNode()!= null;
                    }

              public E next() {

                  if (nextIndex == size - 1)
                      return (E) no;
                  else {

                      next = lastReturned.getNextNode();
                      nextIndex++;
                      lastReturned = next;
                      return lastReturned.getElement();
                  }
              }

            public void remove() {
            }
        };
    }



