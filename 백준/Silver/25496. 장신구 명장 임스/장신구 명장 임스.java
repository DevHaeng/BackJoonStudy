import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int P = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] fatigue = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            fatigue[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(fatigue);
        int count = 0;
        int total = P;

        for (int i = 0; i < N; i++) {
            if (total < 200) {
                total += fatigue[i];
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
