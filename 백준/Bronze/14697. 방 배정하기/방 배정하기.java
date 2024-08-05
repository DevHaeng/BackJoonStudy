import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] num = {a, b, c};
        Arrays.sort(num);

        int result = 0;

        if (n % num[0] == 0 || n % num[1] == 0 || n % num[2] == 0) {
            System.out.println(1);
            return;
        }

        if (n % num[2] != 0) {
            result = n % num[2];
        } else {
            System.out.println(1);
            return;
        }

        if (result % num[1] != 0) {
            result = result % num[1];
        } else {
            System.out.println(1);
            return;
        }

        if (result % num[0] != 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
