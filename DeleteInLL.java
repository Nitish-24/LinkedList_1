public class DeleteInLL {

    public static LinkedList<Integer> deleteNode(LinkedList<Integer> head, int pos) {

        if (pos == 0) {
            head = head.next;
            return head;
        } else {
            LinkedList<Integer> temp = head;
            int currentPos = 0;
            while (temp != null && currentPos != pos - 1) {
                temp = temp.next;
                currentPos++;
            }
            if (temp ==null|| temp.next==null) {
                return head;
            }
            temp.next = temp.next.next;
        }

        return head;
    }
    public static void main(String[] args) {
        LinkedList<Integer>head=  LinkedListUse.createLinkedList();
        LinkedListUse.printLinkedList(head);
        deleteNode(head, 0);
        LinkedListUse.printLinkedList(head);
    }
}
