import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> listA = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            listA.add(i);
        }

        ArrayList<Integer> listB = new ArrayList<>();

        for (int i = 0; i < listA.size()-2; i++) {
            int num = sc.nextInt();
            listB.add(num);
        }

        removeNumber(listA, listB);

        if (listA.get(0) < listA.get(1)) {
            System.out.println(listA.get(0));
            System.out.println(listA.get(1));
        } else {
            System.out.println(listA.get(1));
            System.out.println(listA.get(0));
        }

    }

    private static void removeNumber(ArrayList<Integer> listA, ArrayList<Integer>listB) {
        listA.removeAll(listB);
    }
}