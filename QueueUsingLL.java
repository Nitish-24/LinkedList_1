public class QueueUsingLL {
    private LinkedList <Integer> front;
    private LinkedList<Integer> rear;
    private int size;

    public QueueUsingLL() {
        front = null;
        rear = null;
        size = 0;
    }

    public int getSize() { 
		//Implement the getSize() function
        return size;
    }


    public boolean isEmpty() { 
    	//Implement the isEmpty() function
        return size==0;
    }


    public void enqueue(int data) {
    	//Implement the enqueue(element) function
        LinkedList<Integer> newNode = new LinkedList<Integer>(data);
        if (isEmpty()) {
            front= newNode;
            rear = newNode;
            size++;
        }else{
            rear.next = newNode;
            rear = newNode;
            size++;
        }
    }


    public int dequeue() {
    	//Implement the dequeue() function
        if (isEmpty()) {
            System.out.println("List is empty");
            return -1;
        }else{
            int tempData = front.data;
            front = front.next;
            size--;
            return tempData;
        }
    }


    public int front() {
    	//Implement the front() function
        if (isEmpty()) {
            System.out.println("List is empty");
            return -1;
        }else{
            return front.data;
        }
    }
}
