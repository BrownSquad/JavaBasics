package collections;

/**
 * Created by amatada on 4/14/2017.
 */
public class SingleLinkedList {

    private LinkedNode head;
    private LinkedNode tail;

    public LinkedNode getHead() {
        return head;
    }

    public void setHead(LinkedNode head) {
        this.head = head;
    }

    public LinkedNode getTail() {
        return tail;
    }

    public void setTail(LinkedNode tail) {
        this.tail = tail;
    }

    public void addSortedNode(LinkedNode node){

        if(head==null){
            setHead(node);
            setTail(node);
            return;
        }

        if(head.getValue()>node.getValue()) {
            node.setNext(head);
            setHead(node);
            return;
        }

        LinkedNode current = head;
        while(current.getNext()!=null){
            if(current.getNext().getValue()>node.getValue()) {
                LinkedNode temp = current.getNext();
                current.setNext(node);
                node.setNext(temp);
                return;
            }
            else{
                current = current.getNext();
            }

        }
        if(current.getNext()==null) {
            current.setNext(node);
            setTail(node);
        }

    }

    public void addNode(LinkedNode node){

        if(head==null){
            setHead(node);
            setTail(node);
            return;
        }

        getTail().setNext(node);
        setTail(node);
    }

}
