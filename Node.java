public class Node {
    private Node leftNode, rightNode;
    private int data;

    public Node(int data, Node leftNode, Node rightNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public Node getRightNodeReference() {
        return this.rightNode;
    }

    public Node getLeftNodeReference() {
        return this.leftNode;
    }

    public void setRightNodeReference(Node y) {
        this.rightNode = y;
    }

    public void setLeftNodeReference(Node y) {
        this.leftNode = y;
    }

    public int getData() {
        return this.data;
    }
}
