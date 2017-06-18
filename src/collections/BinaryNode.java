package collections;

/**
 * Created by amatada on 3/10/2017.
 */
public class BinaryNode {

    private String value;
    private BinaryNode left;
    private BinaryNode right;

    public BinaryNode(String value){
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public BinaryNode(String value, BinaryNode left, BinaryNode right){
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public BinaryNode(String value, String leftValue, String rightValue){
        this.value = value;
        this.left = new BinaryNode(leftValue);
        this.right = new BinaryNode(rightValue);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }
}
