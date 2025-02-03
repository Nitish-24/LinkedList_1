public class StackUsingLL {

    private LinkedList<Integer> head;
    // private LinkedList<Integer> tail;
    private int size;

    public int size() {
        System.out.println(size);
        return size;
    }

    public boolean isEmpty() {
        System.out.println(size==0);
        return size==0;
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return -1;
        }else
        System.out.println(head.data);

        return head.data;
    }

    public void push(int data) {
        LinkedList<Integer> currentNode = new LinkedList<Integer>(data);
        if (size == 0) {
            head = currentNode;
        } else {
            currentNode.next = head;
            head = currentNode;
        }
        size++;
    }

    public void pop() {
        if (size==0) {
            System.out.println("Stack is Empty");
        }else{
            head = head.next;
            size--;
        }
    }
}
