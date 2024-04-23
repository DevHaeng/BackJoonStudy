import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int newScore = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        if (n == 0) {
            System.out.println(1);
            return;
        }

        int[] rank = new int[p];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            rank[i] = Integer.parseInt(st.nextToken());
        }

        if (n == p && newScore <= rank[n - 1]) {
            System.out.println(-1);
            return;
        }

        int result = 1;
        for (int i = 0; i < n; i++) {
            if (newScore >= rank[i]) {
                result = i + 1;
                break;
            } else {
                result++;
            }
        }

        if (result <= p) {
            System.out.println(result);
        } else {
            System.out.println(-1);
        }
    }
}