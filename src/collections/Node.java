package collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amatada on 3/10/2017.
 */
public class Node {

    private List<Node> children = null;
    private String value;
    public static final int left = 0;
    public static final int right = 1;

    public Node(String value){
        this.children = new ArrayList<>();
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void addChild(Node child){
        children.add(child);
    }

    public Node getChild(int child){
        if(child==0 || child==1)
            return children.get(child);
        else
            return null;
    }

    public int childCount(){
        return children.size();
    }

    public static int getLeft() {
        return left;
    }

    public static int getRight() {
        return right;
    }

    public List<Node> getChildren() {
        return children;
    }

    public boolean hasChildren(){
        return !children.isEmpty();
    }
}
