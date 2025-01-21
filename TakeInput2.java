import java.util.Scanner;

public class TakeInput2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        LinkedList<Integer>head= null, tail = null;
        int data  = scn.nextInt();
        while (data!=-1) {
            LinkedList<Integer>currentNode = new LinkedList<Integer>(data);
            if (head == null) {
                head= currentNode;
                tail = currentNode;
            }else{
              tail.next = currentNode;
              tail = currentNode;
            }
            data = scn.nextInt();
        }
        scn.close();
      LinkedListUse.printLinkedList(head);
    }
}
