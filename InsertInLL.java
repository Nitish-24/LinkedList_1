
public class InsertInLL {

    public static LinkedList<Integer> insert(LinkedList<Integer> head, int pos, int data) {
        // Your code goes here
        LinkedList<Integer> curruntNode = new LinkedList<Integer>(data);
        int curruntPos = 0;
        LinkedList<Integer> tail = head;
        if (pos == 0) { // if pos is at head
            curruntNode.next = head;
            return curruntNode;
        } else {
            while (tail != null && curruntPos != pos - 1) { // if pos is in between nodes
                tail = tail.next;
                curruntPos++;
            }
            if (tail == null) {
                System.out.println("out of bound");
                return head;
            }

            curruntNode.next = tail.next;
            tail.next = curruntNode;

        }
        // LinkedListUse.printLinkedList(head);
        return head;
    }

    public static void main(String[] args) {
        LinkedList<Integer> head = LinkedListUse.createLinkedList();
        // LinkedListUse.printLinkedList(head);
        insert(head, 0, 100);
        LinkedListUse.printLinkedList(head);

    }
}
