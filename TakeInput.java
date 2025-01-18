import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        LinkedList<Integer> LL = TakeInputt();
        LinkedListUse.printLinkedList(LL);
    }

    public static LinkedList<Integer> TakeInputt() {
        Scanner scn = new Scanner(System.in);
        LinkedList<Integer> head = null;
        int data = scn.nextInt();
        while (data != -1) {
            LinkedList<Integer> curruntNode = new LinkedList<Integer>(data);
            if (head == null) {
                head = curruntNode;
            } else {
                LinkedList<Integer> tail = head;
                while (tail.next != null) {
                    tail = tail.next;
                }
                tail.next = curruntNode;
            }
            data = scn.nextInt();
        }
        scn.close();
        return head;
    }
}
