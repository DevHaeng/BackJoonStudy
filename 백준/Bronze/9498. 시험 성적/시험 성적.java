import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        if (test >= 90 && test <= 100) {
            System.out.println("A");
        } else if (test >= 80 && test < 90) {
            System.out.println("B");
        } else if (test >= 70 && test < 80) {
            System.out.println("C");
        } else if (test >= 60 && test < 70) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }
}