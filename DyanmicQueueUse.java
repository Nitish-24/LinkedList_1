public class DyanmicQueueUse {
    
    public static void main(String[] args) {
        DynamicQueue queue= new DynamicQueue();
        int ary[]={10,20,30,40,50};
        for (int i : ary) {
            queue.enqueue(i);
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}
