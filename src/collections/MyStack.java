package collections;

/**
 * Created by amatada on 4/14/2017.
 */
public class MyStack {

    private LinkedNode top;
    private int size;

    public LinkedNode getTop() {
        return top;
    }

    private void setTop(LinkedNode top) {
        this.top = top;
    }

    public void push(LinkedNode node){
        if(node==null)
            return;
        if(getTop()==null) {
            setTop(node);
            size++;
        }
        else {
            LinkedNode temp = getTop();
            setTop(node);
            getTop().setNext(temp);
            size++;
        }
    }

    public LinkedNode pop(){
        if(getTop()==null)
            return getTop();
        LinkedNode temp = getTop();
        setTop(temp.getNext());
        temp.setNext(null);
        size--;
        return temp;
    }

    public int peak(){
        return getTop().getValue();
    }

    public int getSize() {
        return size;
    }

    private void setSize(int size) {
        this.size = size;
    }
}
