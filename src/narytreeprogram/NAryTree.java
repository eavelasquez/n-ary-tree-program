package narytreeprogram;

/**
 *  The {@code NAryTree} interface implements methods for n-ary tree.
 *
 *  @author ev
 */
public interface NAryTree {

    public void printTree();

    public void printTree(Node temp);

    public void insert(char data);

    public void insert(Node temp, char parent, char data);

    public void delete(Node temp, char data);

    public void search(char data);

    public boolean search(Node temp, char data);

    public void printParents(Node temp);

    public void printChildren(Node temp);

    public void countLeaves();

    public int countLeaves(Node temp);

    public void printTreeDegree(Node temp, char data);

    public void printDegreeLeafByData(Node temp, char data);

    public void printChildrenByData(Node temp, char data);

    public void printSiblingsByData(Node temp, char data);

    public void printLevelByData(Node temp, char data);

    public void printTreeHeight(Node temp);

    public void printParentByData(Node temp, char data);

    public void printLeavesByLevel(Node temp, int level);

    public boolean isLeaf(Node temp);

    public boolean isEmpty(Node temp);

    public String toString();
}
