import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMax {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Enter size");
        int size = scn.nextInt();
        System.out.println("Enter elements in array list:");
        for (int i = 0; i < size; i++) {
            int num = scn.nextInt();
            al.add(num);
        }
        int max = al.get(0);
        for (Integer integer : al) {
            if (integer >= max) {
                max = integer;
            }
        }
        System.out.println(max);
        scn.close();
    }
}
