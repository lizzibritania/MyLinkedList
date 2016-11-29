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
        if(this.cnode != null) {
            Node newNode = new Node(element, this.cnode.getNextNode());
            this.cnode.setNextNode(newNode);
            this.cnode = newNode;
        } else {
            this.head = this.tail = new Node(element, (Node)null);
            this.cnode = this.head;
        }

        ++this.size;
    }

    public String toString() {
        String str = "";
        if(this.head != null) {
            str = str + this.head.getElement();

            for(Node current = this.head.getNextNode(); current != null; current = current.getNextNode()) {
                str = str + ", " + current.getElement();
            }
        }

        return str;
    }

    public void add(Object element, int index) {
        Node cur;
        if(index == 0) {
            cur = new Node(element, this.head, (Node)null);
            this.head = cur;
            ++this.size;
        } else if(index > this.size) {
            this.add(element);
        } else {
            cur = this.head;

            for(int newnode = 0; newnode < index - 1; ++newnode) {
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
        if(index >= this.size) {
            System.out.println("No such element");
            return null;
        } else {
            for(int i = 0; i < index; ++i) {
                result.setElement(result.getNextNode().getElement());
                result.setNextNode(result.getNextNode());
            }

            return result.getElement();
        }
    }

    public int indexOf(Object element) {
        return 0;
    }

    public Object remove(int index) {
        return null;
    }

    public E set(int index, Object element) {
        if(index == 0) {
            this.head.setElement((E) element);
        } else {
            Node cur = this.head;

            for(int i = 0; i < index - 1; ++i) {
                cur = cur.getNextNode();
            }
        }

        return null;
    }

    public int size() {
        return this.size;
    }

    public Object[] toArray() {
        Node curr = this.head;
        Object[] objects = new Object[this.size];

        for(int i = 0; i < this.size - 1; ++i) {
            objects[i] = curr.getElement();
            curr.setElement(curr.getNextNode().getElement());
            curr.setNextNode(curr.getNextNode().getNextNode());
        }

        objects[this.size - 1] = curr.getElement();
        return objects;
    }

    public Iterator<E> iterator() {
        return new Iterator() {
            private Node<E> current;
            int number;

            {
                this.current = MyLinkedList.this.myLinkedListIter.head;
                this.number = 1;
            }

            public boolean hasNext() {
                return this.current.getNextNode() != null;
            }

            public E next() {
                Object result = null;
                if(this.hasNext()) {
                    result = this.current.getNextNode().getElement();
                    this.current.setElement(this.current.getNextNode().getElement());
                    this.current.setNextNode(this.current.getNextNode().getNextNode());
                }

                return (E) result;
            }

            public void remove() {
            }
        };
    }
}
