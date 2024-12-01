import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = 0;
        for (int i = 0; i < 4; i++) {
            int n = Integer.parseInt(br.readLine());
            total += n;
        }
        int x = total / 60;
        int y = total % 60;

        System.out.println(x);
        System.out.println(y);
    }
}