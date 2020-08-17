package edu.eci.arep.CalculatorWebApp.DataStructure;

import java.util.Iterator;

/**
 * The type Linked list iterator, used to make possible the iteration around a LinkedList.
 *
 * @param <E> the type parameter
 */
public class LinkedListIterator<E> implements Iterator<E>{
    /**
     * The Current Node, Usually its the Linked List's head.
     */
    Node<E> current;

    /**
     * Instantiates a new Linked list iterator.
     *
     * @param l the LinkedList to iterate
     */
    public LinkedListIterator(LinkedList<E> l)
    {
       this.current = l.getHead();
    }

    public E next() {
        E data = current.getData();
        this.current = current.getRight();
        return data;
    }

    public boolean hasNext() {
        return current  != null;
    }

    public void remove() {
    }
}
