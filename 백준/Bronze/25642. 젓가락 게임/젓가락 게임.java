import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        while (true) {
            b += a;
            if (b >= 5) {
                System.out.println("yt");
                break;
            }
            a += b;
            if (a >= 5) {
                System.out.println("yj");
                break;
            }
        }
    }
}
