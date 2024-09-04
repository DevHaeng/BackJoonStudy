import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        int number = 0;
        for (int i = 1; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            int n3 = Integer.parseInt(st.nextToken());
            int n4 = Integer.parseInt(st.nextToken());
            int sum = n1 + n2 + n3 + n4;
            if (sum > max) {
                number = i;
                max = sum;
            }
        }
        System.out.println(number + " " + max);
    }
}