package collections;

import java.util.*;

import static java.lang.System.exit;

/**
 * Created by amatada on 3/9/2017.
 */
public class TreeLoop {

    Set visited = new LinkedHashSet();

    public static void main(String[] args){
        TreeLoop loop = new TreeLoop();
        //loop.walkBinaryNode(loop.createBinaryTree());
        loop.walkTree(loop.createTree());
        System.out.print(Arrays.toString(loop.visited.toArray()));
    }

    private void walkBinaryNode(BinaryNode root){
        if(root!=null && visited.add(root.getValue())){
            if(root.getLeft()!=null){
                walkBinaryNode(root.getLeft());
            }
            if(root.getRight()!=null){
                walkBinaryNode(root.getRight());
            }
        } else{
            System.out.println("Found a loop :" + root.getValue() + " already exists");
            System.out.print(Arrays.toString(visited.toArray()));
            exit(1);
        }
    }

    public BinaryNode createBinaryTree(){
        BinaryNode rootNode = new BinaryNode("1","2","3");
        rootNode.getLeft().setLeft(new BinaryNode("4"));
        rootNode.getLeft().setRight(new BinaryNode("5"));
        rootNode.getRight().setLeft(new BinaryNode("6"));
        rootNode.getRight().setRight(new BinaryNode("7"));
        BinaryNode level2 = rootNode.getRight().getRight();
        level2.setLeft(rootNode.getRight().getLeft());
        level2.setRight(new BinaryNode("8"));
        return rootNode;
    }

    public void walkTree(Node rootNode){

        if(rootNode!=null && visited.add(rootNode.getValue())){
            if(rootNode.hasChildren()) {
                Iterator<Node> children;
                children = rootNode.getChildren().iterator();
                while (children!=null && children.hasNext()) {
                    walkTree(children.next());
                }
            }
        } else {
            System.out.println("Found a loop :" + rootNode.getValue() + " already exists");
            System.out.print(Arrays.toString(visited.toArray()));
            exit(1);
        }
    }

    public Node createTree(){
        Node rootNode = new Node("1");
        rootNode.addChild(new Node("2"));
        rootNode.addChild(new Node("3"));
        rootNode.getChild(Node.left).addChild(new Node("4"));
        rootNode.getChild(Node.left).addChild(new Node("5"));
        rootNode.getChild(Node.right).addChild(new Node("6"));
        rootNode.getChild(Node.right).addChild(new Node("7"));
        Node level1 = rootNode.getChild(Node.right);
        Node level2 = rootNode.getChild(Node.right);
        level2.addChild(rootNode.getChild(Node.right).getChild(Node.left));
        level2.addChild(new Node("8"));
        return rootNode;
    }
}
