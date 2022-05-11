/******************************************************************************
 *  Compilation:  javac NAryTreeProgram.java
 *  Execution:    java NAryTreeProgram
 *
 *  A program that creates a n-ary tree and prints it out.
 *
 ******************************************************************************/
package narytreeprogram;

/**
 *  The {@code NAryTreeProgram} class represents a n-ary tree program.
 *
 *  @author ev
 */
public class NAryTreeProgram {

    /**
     * Unit tests the {@code NAryTreeProgram} data type.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World from N-Ary Tree Program!");

        NAryTreeGLL tree = new NAryTreeGLL();

        tree.insert('a');
        tree.insert(tree.getRoot(), 'a', 'b');
        tree.insert(tree.getRoot(), 'a', 'c');
        tree.insert(tree.getRoot(), 'a', 'd');
        tree.insert(tree.getRoot(), 'b', 'e');
        tree.insert(tree.getRoot(), 'b', 'f');
        tree.insert(tree.getRoot(), 'c', 'g');

        System.out.println("Tree");
        tree.printTree();

        System.out.println("\n\nParents");
        tree.printParents(tree.getRoot());

        System.out.println("\n\nChildren");
        tree.printChildren(tree.getRoot());

        System.out.print("\n\nSearch 'g': ");
        tree.search('g');
    }
}
