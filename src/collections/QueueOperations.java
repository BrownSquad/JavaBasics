package collections;

/**
 * Created by amatada on 4/15/2017.
 */
public class QueueOperations {

    public static void main(String args[]){
        QueueOperations ops = new QueueOperations();

        MyQueue myQueue1 = new MyQueue();
        myQueue1.add(new LinkedNode(1));
        myQueue1.add(new LinkedNode(2));
        myQueue1.add(new LinkedNode(3));
        myQueue1.add(new LinkedNode(4));
        myQueue1.add(new LinkedNode(5));

        MyQueue myQueue2 = new MyQueue();
        myQueue2.add(new LinkedNode(1));
        myQueue2.add(new LinkedNode(2));
        myQueue2.add(new LinkedNode(3));
        myQueue2.add(new LinkedNode(4));
        myQueue2.add(new LinkedNode(4));

        System.out.println(ops.compareQueue(myQueue1,myQueue2));
    }

    public boolean compareQueue(MyQueue one, MyQueue two){
        if(one.getSize()!=two.getSize())
            return false;

        if(one.getHead()==null || two.getHead()==null)
            return false;

        while(one.getHead()!=null || two.getHead()!=null){
            if(one.remove().getValue()!=two.remove().getValue())
                return false;
        }
        if(one.getHead()==null && two.getHead()==null)
            return true;
        else
            return false;
    }
}
