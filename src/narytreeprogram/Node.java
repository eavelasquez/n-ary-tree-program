package narytreeprogram;

/**
 *  The {@code Node} class represents a node for linked lists.
 *
 *  @author ev
 */
public class Node {

    private int flag; // 0 down not exists, 1 down exists
    private char data;
    private Node next, down; // next and down pointers

    /**
     * Initializes a new node.
     *
     * @param data the data to store in the node.
     */
    public Node(char data) {
        this.flag = 0;
        this.data = data;
        this.next = null;
        this.down = null;
    }

    /**
     * Initializes a new node.
     *
     * @param flag the flag.
     * @param data the data to store in the node.
     * @param next the next pointer.
     * @param down the down pointer.
     */
    public Node(int flag, char data, Node next, Node down) {
        this.flag = flag;
        this.data = data;
        this.next = next;
        this.down = down;
    }

    /**
     * Returns the flag of this node.
     *
     * @return the flag of this node.
     */
    public int getFlag() {
        return flag;
    }

    /**
     * Sets the flag of this node.
     *
     * @param flag the flag.
     */
    public void setFlag(int flag) {
        this.flag = flag;
    }

    /**
     * Returns the data of this node.
     *
     * @return the data of this node.
     */
    public char getData() {
        return data;
    }

    /**
     * Sets the data of this node.
     *
     * @param data the data.
     */
    public void setData(char data) {
        this.data = data;
    }

    /**
     * Returns the next pointer.
     *
     * @return the next pointer.
     */
    public Node getNext() {
        return next;
    }

    /**
     * Sets the next pointer.
     *
     * @param next the next pointer.
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * Returns the down pointer.
     *
     * @return the down pointer.
     */
    public Node getDown() {
        return down;
    }

    /**
     * Sets the down pointer.
     *
     * @param down the down pointer.
     */
    public void setDown(Node down) {
        this.down = down;
    }

    /**
     * Returns the last node of the linked list.
     *
     * @param temp the first node of the linked list.
     * @return the last node of the linked list.
     */
    public static Node getLastNode(Node temp) {
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }

        return temp;
    }
}
