/**
 * Created by Lizzi on 29.11.2016.
 */
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Node<E> {
    private E element;
    public Node<E> nextNode;
    public Node<E> prevNode;

    public <E> Node() {
    }

    public Node(E element) {
        this.element = element;
    }

    public Node(E element, Node<E> nextNode) {
        this.element = element;
        this.nextNode = nextNode;
        this.prevNode = null;
    }

    public String toString() {
        return "Node{element=" + this.element;
    }

    public Node(E element, Node nextNode, Node prevNode) {
        this.element = element;
        this.nextNode = nextNode;
        this.prevNode = prevNode;
    }

    public E getElement() {
        return this.element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Node<E> getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(Node<E> nextNode) {
        this.nextNode = nextNode;
    }

    public Node<E> getPrevNode() {
        return this.prevNode;
    }

    public void setPrevNode(Node<E> prevNode) {
        this.prevNode = prevNode;
    }
}
