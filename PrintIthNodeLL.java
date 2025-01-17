

public class PrintIthNodeLL {
    public static void PrintIthNode(LinkedList<Integer>head , int i){

         LinkedList<Integer> temp = head;
         int curruntCount = 0;
         while (temp!=null) {
             if (i==curruntCount) {
                System.out.println(temp.data);
                 break;
             }
             temp= temp.next;
             curruntCount++;
         }
    }
    public static void main(String[] args) {
        LinkedList<Integer>LL = LinkedListUse.createLinkedList();
         PrintIthNode(LL, 3);
        
    }
}
