import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] coin = {512, 256, 128, 64, 32, 16, 8, 4, 2, 1};

        for (int value : coin) {
            if (s >= value) {
                s -= value;
            }
        }

        if (s == 0) {
            System.out.println("No thanks");
            return;
        }

        if ((s & m) == s) {
            System.out.println("Thanks");
        } else {
            System.out.println("Impossible");
        }
    }
}