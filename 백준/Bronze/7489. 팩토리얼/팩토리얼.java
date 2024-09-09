import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int result = 1;

            for (int j = 2; j <= n; j++) {
                result *= j;

                while (result % 10 == 0) {
                    result /= 10;
                }
                
                result %= 100000;
            }

            System.out.println(result % 10);
        }
    }
}