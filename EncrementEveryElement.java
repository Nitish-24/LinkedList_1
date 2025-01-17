public class EncrementEveryElement {

    public static LinkedList<Integer> EncrementEveryElementLL(LinkedList<Integer>head){
      LinkedList<Integer> temp = head;
      while (temp!=null) {
        temp.data++;
        temp = temp.next;
      }
        return head;
    }
    public static void main(String[] args) {
        LinkedList<Integer> headNode = LinkedListUse.createLinkedList();
        LinkedListUse.printLinkedList(headNode);
        EncrementEveryElementLL(headNode);
        LinkedListUse.printLinkedList(headNode);
    }
}
