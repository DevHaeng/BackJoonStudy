import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int[] scores = new int[N];
        int sum = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
            sum += scores[i];
        }

        Arrays.sort(scores);
        int count = 0;

        for (int i = 0; i < L; i++) {
            sum -= scores[i];
            count++;
        }

        for (int i = H - 1; i >= 0; i--) {
            sum -= scores[N - i - 1];
            count++;
        }

        double avg = (double) sum / (N - count);

        System.out.println(avg);
    }
}
