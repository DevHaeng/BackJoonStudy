import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numM = sc.nextInt();
        int numN = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        int numSum = 0;

        for (int i = numM; i <= numN; i++) {

            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    if (i == j) {
                        numbers.add(j);
                    } else {
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < numbers.size(); i ++) {
            numSum += numbers.get(i);
        }

        if (numSum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(numSum);
            System.out.println(numbers.get(0));
        }
    }
}