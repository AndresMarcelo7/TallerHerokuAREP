package edu.eci.arep.CalculatorWebApp.DataStructure;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * The Linked list Data Structure.
 *
 * @param <E> the type parameter
 */
public class LinkedList<E> extends AbstractCollection<E> {
    /**
     * The Linked List's head.
     */
    Node<E> head;
    /**
     * The Linked List's Tail.
     */
    Node<E> tail;
    /**
     * The Linked List's Size
     */
    private int size=0;

    /**
     * Removes the Linked List's first element (HEAD).
     *
     * @return the data of the deleted element
     * @throws NoSuchElementException if the linked list has no elements.
     */
    public E remove() throws NoSuchElementException{
        if (size > 0){
            E data = head.getData();
            if (head == tail && head != null){
                head = tail = null;
            }
            else {
                Node<E> aux = head.getRight();
                head.setRight(null);
                head = aux;
            }
            size -=1;
            return data;
        }
        else{
            throw new NoSuchElementException("No hay mas elementos en la Lista!");
        }

    }

    public boolean add(E data) {
        Node<E> node = new Node<E>(data);
        if (head==null){
            head = tail = node;
        }
        else{
            tail.setRight(node);
            tail = node;
        }
        size+=1;
        return true;
    }


    /**
     * Gets the first element of the LinkedList (HEAD).
     *
     * @return the head
     */
    public Node<E> getHead() {
        return head;
    }

    /**
     * Sets the first element of a linked list (HEAD).
     *
     * @param head the first elemenent (head)
     */
    public void setHead(Node<E> head) {
        this.head = head;
    }

    /**
     * Gets the last element of the Linked List (TAIL).
     *
     * @return the last element  (tail)
     */
    public Node<E> getTail() {
        return tail;
    }

    /**
     * Sets tail.
     *
     * @param tail the last element (TAIL)
     */
    public void setTail(Node<E> tail) {
        this.tail = tail;
    }

    public Iterator<E> iterator() {
        return new LinkedListIterator<E>(this);
    }

    public int size() {
        return size;
    }


}
