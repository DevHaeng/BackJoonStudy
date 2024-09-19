import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int idx = 1, total = 0;
        while (n != 0) {
            n -= idx;
            idx++;
            if (idx > n) idx = 1;
            total++;
        }
        System.out.println(total);
    }
}