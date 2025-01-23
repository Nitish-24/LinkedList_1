public class StackUsingArray {
    private int data[];
    private int top = -1;

    public StackUsingArray() {
        data = new int[10];
    }

    public int top() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(data[top]);
            return data[top];
        }
        return data[top];
    }

    public void push(int element) {
        data[top + 1] = element;
        System.out.println(element+"pushed");
        top++;
    }

    public int pop() {

        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            int temp = data[top];
            top--;
            System.out.println(temp);
            return temp;
        }
        return -1;
    }

    public int size() {
        System.out.println(top + 1);
        return top + 1;
    }

    public boolean isEmpty() {
        if (top == -1) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
