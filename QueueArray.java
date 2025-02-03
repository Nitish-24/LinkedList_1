public class QueueArray {
    int ary[];
    int sizee = 0;
    int front = -1;
    int rear = -1;

    public QueueArray() {
        ary = new int[10];
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("-1");
            return -1;
        }
        return ary[front];
    }

    public boolean isEmpty() {
        return sizee == 0;
    }

    public int size() {
        return sizee;
    }

    public void enqueue(int data) {
        if (sizee == 0) {
            front=0;
            rear=0;
        }
        if (rear>=ary.length-1) {
            System.out.println("queue is full");
            return;
        }
        rear =(rear+1)%ary.length;
        ary[rear] = data;
        sizee++;
        
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        int temp = ary[front];
        front= (front+1)%ary.length;
        sizee--;
        if (sizee==0) {
            front =-1;
            rear= -1;
        }
        return temp;
    }

}
