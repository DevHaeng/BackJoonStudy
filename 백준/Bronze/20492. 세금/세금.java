import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int num1 = n * 78 / 100;
        int num2 = (int)(n - (n * 0.2 * 0.22));

        System.out.println(num1 + " " + num2);
    }
}