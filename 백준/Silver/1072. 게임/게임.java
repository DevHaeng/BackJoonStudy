import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long x = Integer.parseInt(st.nextToken());
        long y = Integer.parseInt(st.nextToken());
        long z = y * 100 / x;

        if (z >= 99) {
            System.out.println(-1);
            return;
        }

        long start = 1;
        long end = x;

        while (start <= end) {
            long mid = (start + end) / 2;
            long rate = (y + mid) * 100 / (x + mid);

            if (rate > z) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(start);
    }
}