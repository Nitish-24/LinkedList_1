import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(40);
        al1.add(30);
        al1.add(20);
        al1.add(50);

        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(60);
        al2.add(90);
        al2.add(80);
        al2.add(70);
        al2.add(100);

        al1.addAll(al2);
        for (Integer integer : al1) {
            System.out.print(integer+" ");
        }
        Collections.sort(al1);
        System.out.println();
        for (Integer integer : al1) {
            System.out.print(integer+" ");
        }
    }
}