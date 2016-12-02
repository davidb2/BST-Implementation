import java.util.Queue;
import java.util.LinkedList;

public class Tree {
    private Node root;
 
    public Tree() { 
        this.root = null; 
    }
 
    public Node getRoot() {
        return this.root;
    }
 
    public boolean isEmpty() {
        return this.root == null;
    }
 
 
    public void insert(int value, Node x) {
        if (x == null) {
            this.root = new Node(value, null, null);
        } else {
            if (value < x.getData()) {
                if (x.getLeftNodeReference() == null) {
                    Node y = new Node(value, null, null);
                    x.setLeftNodeReference(y);
                } else {
                    insert(value, x.getLeftNodeReference());
                }
            } else {
                if (x.getRightNodeReference() == null) {
                    Node y = new Node(value, null, null);
                    x.setRightNodeReference(y);
                } else {
                    insert(value, x.getRightNodeReference());
                }
            }
        }
    }
    
    public void printTreeByLevel(Node currentNode) {
        Queue<Pair<Node, Integer>> bfs = new LinkedList<>();
        bfs.add(new Pair<Node, Integer>(currentNode, 1));
        int lastLevel = 0;
        while (!bfs.isEmpty()) {
            Pair<Node, Integer> top = bfs.poll();
            Node node = top.first;
            int level = top.second;
            if (node != null) {
                if (level > lastLevel) {
                    System.out.printf("\nLevel %d: ", level);
                }
                lastLevel = level;
                System.out.printf("%d ", node.getData());
                bfs.add(new Pair<Node, Integer>(node.getLeftNodeReference(), level+1));
                bfs.add(new Pair<Node, Integer>(node.getRightNodeReference(), level+1));
            }
        }
    }

    public void outputTree(Node currentNode, int spaces) {
        if (currentNode != null) {
            outputTree(currentNode.getRightNodeReference(), spaces + 5);
            System.out.printf("%s%d\n",
                new String(new char[spaces]).replace("\0", " "), 
                currentNode.getData()
            );
            outputTree(currentNode.getLeftNodeReference(), spaces + 5);
        }
    }
}
