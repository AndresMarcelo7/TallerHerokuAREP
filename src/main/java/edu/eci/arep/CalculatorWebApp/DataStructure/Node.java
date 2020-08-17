package edu.eci.arep.CalculatorWebApp.DataStructure;

/**
 * The type Node, Used as element of a LinkedList.
 *
 * @param <E> the type parameter
 */
public class Node<E> {
    private Node<E> Right;
    private E data;

    /**
     * Instantiates a new Node.
     *
     * @param data the data
     */
    public Node(E data) {
        this.data = data;
    }

    /**
     * Gets the right Node.
     *
     * @return the right
     */
    public Node<E> getRight() {
        return Right;
    }

    /**
     * Sets the right node.
     *
     * @param right the right
     */
    public void setRight(Node<E> right) {
        Right = right;
    }

    /**
     * Gets the data of the current node.
     *
     * @return the data of the node
     */
    public E getData() {
        return data;
    }

    /**
     * Sets the data of the node.
     *
     * @param data the data to be inserted
     */
    public void setData(E data) {
        this.data = data;
    }
}
