import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = (a+b)%c;
        int e = ((a%c)+(b%c))%c;
        int f = (a*b)%c;
        int g = ((a%c)*(b%c))%c;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

    }
}