public class LinkedListUse {

    public static LinkedList<Integer> createLinkedList() {
        LinkedList<Integer> l1LinkedList = new LinkedList<>(10);
        LinkedList<Integer> l2LinkedList = new LinkedList<>(20);
        LinkedList<Integer> l3LinkedList = new LinkedList<>(30);
        LinkedList<Integer> l4LinkedList = new LinkedList<>(40);
        LinkedList<Integer> l5LinkedList = new LinkedList<>(50);
        l1LinkedList.next = l2LinkedList;
        l2LinkedList.next = l3LinkedList;
        l3LinkedList.next = l4LinkedList;
        l4LinkedList.next = l5LinkedList;
        return l1LinkedList;

    }
    public static void printLinkedList(LinkedList<Integer>head){
        LinkedList<Integer> temp =head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // l1LinkedList.data=10;
        LinkedList<Integer> headNode = createLinkedList();
        printLinkedList(headNode);

    }
}
