public class LinkedList<T> {
    
    T data;
    LinkedList <T> next;

    public LinkedList(T data){
        this.data = data;
    }

   void printDetails(){
    System.out.println(this.data);
    System.out.println(this.next);
   } 
}
