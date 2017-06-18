package collections;

/**
 * Created by amatada on 4/14/2017.
 */
public class StackOperations {

    public static void main(String args[]){
        StackOperations ops = new StackOperations();
        MyStack stack = new MyStack();
        /*
        stack.push(new LinkedNode(1));
        stack.push(new LinkedNode(2));
        stack.push(new LinkedNode(3));
        MyStack newStack = ops.reverse(stack);
        ops.printStack(newStack);
        */
        stack.push(new LinkedNode(1));
        stack.push(new LinkedNode(2));
        stack.push(new LinkedNode(3));
        stack.push(new LinkedNode(4));
        stack.push(new LinkedNode(5));
        stack.push(new LinkedNode(6));
        stack.push(new LinkedNode(7));
        stack.push(new LinkedNode(8));
        stack.push(new LinkedNode(9));
        ops.clearEven(stack);
        ops.printStack(stack);
    }

    private MyStack reverse(MyStack old){
        if(old.getTop()==null)
            return null;
        MyStack newStack = new MyStack();
        while(old.getTop()!=null){
            newStack.push(old.pop());
        }
        return newStack;
    }

    private void printStack(MyStack stack){
        while(stack.getTop()!=null){
            System.out.println(stack.pop().getValue());
        }
    }

    private void clearEven(MyStack stack){
        MyStack newStack = new MyStack();

        while(stack.getTop()!=null){
            if(stack.peak()%2==0)
                stack.pop();
            else
                newStack.push(stack.pop());
        }
        while (newStack.getTop()!=null) {
            stack.push(newStack.pop());
        }
    }
}
