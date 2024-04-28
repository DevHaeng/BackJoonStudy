import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());
        Integer[] topping = new Integer[N];
        for (int i = 0; i < N; i++) {
            topping[i] = Integer.parseInt(br.readLine());
        }

        int cost = A;
        int calory = C;
        int total = C / A;
        Arrays.sort(topping, Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            cost += B;
            calory += topping[i];
            int result = calory / cost;
            if (total > result) {
                break;
            } else {
                total = result;
            }
        }
        System.out.println(total);
    }
}
