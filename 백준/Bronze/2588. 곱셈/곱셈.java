import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = ((b%100)%10);
        int d = ((b%100)-((b%100)%10))/10;
        int e = (b-(b%100))/100;
        int f = a * b;

        System.out.println(a*c);
        System.out.println(a*d);
        System.out.println(a*e);
        System.out.println(f);
    }
}
