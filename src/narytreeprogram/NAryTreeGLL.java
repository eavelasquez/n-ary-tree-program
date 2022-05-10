/******************************************************************************
 *  Compilation:  javac NAryTreeGLL.java
 *  Execution:    java NAryTreeGLL
 *  
 *  A n-ary tree is a tree in which each node has at most n children.
 *  It's represented as a generalized linked list (GLL).
 *
 ******************************************************************************/
package narytreeprogram;

/**
 * The {@code NAryTreeGLL} class implements methods for n-ary tree.
 *
 * @author ev
 */
public class NAryTreeGLL implements NAryTree {

    private Node root;
    private int degree, height;

    public NAryTreeGLL() {
        degree = 0;
        height = 0;
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    @Override
    public void print(Node temp) {
        // TODO Auto-generated method stub
    }

    @Override
    public void insert(char data) {
        // TODO Auto-generated method stub
    }

    @Override
    public void insert(Node temp, char parent, char data) {
        // TODO Auto-generated method stub
    }

    @Override
    public void delete(Node temp, char data) {
        // TODO Auto-generated method stub
    }

    @Override
    public void search(Node temp, char data) {
        // TODO Auto-generated method stub
    }

    @Override
    public void printParents(Node temp) {
        // TODO Auto-generated method stub
    }

    @Override
    public void printChildren(Node temp) {
        // TODO Auto-generated method stub
    }

    @Override
    public void countLeaves(Node temp) {
        // TODO Auto-generated method stub
    }

    @Override
    public void printTreeDegree(Node temp, char data) {
        // TODO Auto-generated method stub
    }

    @Override
    public void printDegreeLeafByData(Node temp, char data) {
        // TODO Auto-generated method stub
    }

    @Override
    public void printChildrenByData(Node temp, char data) {
        // TODO Auto-generated method stub
    }

    @Override
    public void printSiblingsByData(Node temp, char data) {
        // TODO Auto-generated method stub
    }

    @Override
    public void printLevelByData(Node temp, char data) {
        // TODO Auto-generated method stub
    }

    @Override
    public void printTreeHeight(Node temp) {
        // TODO Auto-generated method stub
    }

    @Override
    public void printParentByData(Node temp, char data) {
        // TODO Auto-generated method stub
    }

    @Override
    public void printLeavesByLevel(Node temp, int level) {
        // TODO Auto-generated method stub
    }

    @Override
    public boolean isLeaf(Node temp) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isEmpty(Node temp) {
        // TODO Auto-generated method stub
        return false;
    }
}