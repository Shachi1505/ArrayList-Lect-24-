import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length");
        int n = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }
        System.out.println("Array after removing");
        l.remove(2)
        // New for loop
        for (int k = 0; k < l.size(); k++) {
            System.out.print(l.get(k) + " ");
        }
    }
}
