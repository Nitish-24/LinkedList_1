public class DynamicQueue {
    private int ary[];
    private int front = -1;
    private int rear = -1;
    private int size;
    private int capacity = 2;

    public DynamicQueue() {
        ary = new int[capacity];
    }

    // Helper methods
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    private void resize() {
        int newCapacity = capacity * 2;
        int temp[] = ary;
        ary = new int[newCapacity];
        // coping elements
        int index = 0;
        for (int i = front; i < temp.length; i++) {
            ary[index] = temp[i];
            index++;
        }
        for (int i = 0; i < front - 1; i++) {
            ary[index] = temp[i];
            index++;
        }
        front = 0;
        rear = temp.length-1;
        capacity = newCapacity;

    }

    // COre operations
    public void enqueue(int data) {
        if (isFull()) {
            resize();
        }
        if (isEmpty()) {
            front = 0;
            rear =0;
        }else{

        rear = (rear + 1) % capacity;
        }
        ary[rear] = data;
        size++;

    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = ary[front];
        front = (front + 1) % ary.length;
        size--;
        if (isEmpty()) {
            front = -1;
            rear = -1;
        }
        return temp;
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
      
        return ary[front];
    }
}
