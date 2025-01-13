import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        Integer i =40;
        al.remove(i);
        al.set(2, 100);

        for (Integer integer : al) {
            System.out.println(integer);
        }
    }
}
