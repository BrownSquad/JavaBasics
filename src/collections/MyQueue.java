package collections;

/**
 * Created by amatada on 4/15/2017.
 */
public class MyQueue {
    private LinkedNode tail;
    private LinkedNode head;
    private int size;

    public void add(LinkedNode node){
        if(getTail()==null){
            setTail(node);
            setHead(node);
            size++;
            return;
        }
        getTail().setNext(node);
        setTail(node);
        size++;
    }

    public LinkedNode remove(){
        if(getHead()==null)
            return null;
        LinkedNode temp = getHead();
        setHead(temp.getNext());
        size--;
        return temp;
    }

    public LinkedNode getTail() {
        return tail;
    }

    private void setTail(LinkedNode tail) {
        this.tail = tail;
    }

    public LinkedNode getHead() {
        return head;
    }

    private void setHead(LinkedNode head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    private void setSize(int size) {
        this.size = size;
    }

}
