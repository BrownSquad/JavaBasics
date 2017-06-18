package collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

import static java.lang.System.exit;

/**
 * Created by amatada on 4/12/2017.
 */
public class TreeOperations {

    BinaryNode newRoot = null;

    public static void main(String args[]){
        TreeOperations ops = new TreeOperations();
        BinaryNode root = ops.createBinaryTree();
        BinaryNode node = new BinaryNode("2");
        //ops.addNode(node);

        ops.addNode(new BinaryNode("6"));
        ops.addNode(new BinaryNode("2"));
        ops.addNode(new BinaryNode("1"));
        ops.addNode(new BinaryNode("4"));
        ops.addNode(new BinaryNode("3"));
        ops.addNode(new BinaryNode("5"));
        ops.addNode(new BinaryNode("7"));
        ops.addNode(new BinaryNode("9"));
        ops.addNode(new BinaryNode("8"));
        //ops.walkTree(ops.newRoot);
        /*
        ops.inOrderTraversal(ops.newRoot);
        System.out.println("-----");
        ops.preOrderTraversal(ops.newRoot);
        System.out.println("-----");
        ops.postOrderTravesal(ops.newRoot);
        */
        ops.printAtLevel(ops.newRoot,4,1);
    }

    public BinaryNode createBinaryTree(){
        BinaryNode rootNode = new BinaryNode("7","3","9");
        rootNode.getLeft().setLeft(new BinaryNode("1"));
        rootNode.getLeft().setRight(new BinaryNode("5"));
        rootNode.getRight().setLeft(new BinaryNode("9"));
        return rootNode;
    }

    public void walkTree(BinaryNode root){

        if(root!=null) {
            walkTree(root.getLeft());
            walkTree(root.getRight());
            System.out.println(root.getValue());
        }
    }

    public void inOrderTraversal(BinaryNode node){

        if(node==null)
            return;
        inOrderTraversal(node.getLeft());
        System.out.println(node.getValue());
        inOrderTraversal(node.getRight());
    }

    public void preOrderTraversal(BinaryNode node){
        if(node==null)
            return;
        System.out.println(node.getValue());
        preOrderTraversal(node.getLeft());
        preOrderTraversal(node.getRight());
    }

    public void postOrderTravesal(BinaryNode node){
        if(node==null)
            return;
        postOrderTravesal(node.getLeft());
        postOrderTravesal(node.getRight());
        System.out.println(node.getValue());
    }

    public void breadthFirstSearch(BinaryNode node){
        if(node==null)
            return;
        System.out.println(node.getValue());
        //if(node.)
    }

    public void printAtLevel(BinaryNode node, int printLevel, int depth){

        if(node==null)
            return;
        if(depth==printLevel)
            System.out.println(node.getValue());
        depth++;
        printAtLevel(node.getLeft(),printLevel,depth);
        printAtLevel(node.getRight(),printLevel, depth);
        depth--;
    }

    public void addNode(BinaryNode node){

        if(node==null)
            return;

        BinaryNode current = newRoot;
        if(newRoot==null) {
            newRoot = node;
            return;
        }
        do{
            BinaryNode parent = current;
            if(Integer.parseInt(current.getValue())<Integer.parseInt(node.getValue())){
                if((current = current.getRight())==null){
                    parent.setRight(node);
                    return;
                }
            } else if(Integer.parseInt(current.getValue())>Integer.parseInt(node.getValue())) {
                if((current = current.getLeft())==null) {
                    parent.setLeft(node);
                    return;
                }
            }

        }while(current!=null);
    }
}
