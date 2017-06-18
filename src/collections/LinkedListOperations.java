package collections;

/**
 * Created by amatada on 4/14/2017.
 */
public class LinkedListOperations {

    public static void main(String args[]){
        SingleLinkedList singleList = new SingleLinkedList();
        singleList.addSortedNode(new LinkedNode(5));
        singleList.addSortedNode(new LinkedNode(3));
        singleList.addSortedNode(new LinkedNode(7));
        singleList.addSortedNode(new LinkedNode(5));
        singleList.addSortedNode(new LinkedNode(1));
        singleList.addSortedNode(new LinkedNode(2));

        PrintList(singleList);
    }

    private static void PrintList(SingleLinkedList singleList) {
        LinkedNode node = singleList.getHead();
        while(node!=null) {
            if(node.getNext()!=null)
                System.out.print(node.getValue() + "->");
            else
                System.out.print(node.getValue());
            node = node.getNext();
        }
    }
}
