import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int reverse = sc.nextInt();
        int temp = 0;

        ArrayList<Integer> basket = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            basket.add(i);
        }

        for (int i = 0; i < reverse; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;

            while (a < b) {
                temp = basket.get(a);
                basket.set(a, basket.get(b));
                basket.set(b, temp);
                a++;
                b--;
            }
        }

        for (int i : basket) {
            System.out.print(i + " ");
        }
    }
}