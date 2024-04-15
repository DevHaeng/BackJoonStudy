import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] players = new int[n + 1];

        for (int i = 0; i < n; i++) {
            int vote = Integer.parseInt(st.nextToken());
            players[vote] += 1;
        }

        int max = 0;
        int imposter = 0;
        int maxCount = 0;

        for (int i = 1; i <= n; i++) {
            if (max < players[i]) {
                max = players[i];
                imposter = i;
                maxCount = 0;
            } else if (max == players[i]) {
                maxCount = 1;
            }
        }

        if (maxCount == 1) {
            System.out.println("skipped");
        } else {
            System.out.println(imposter);
        }

    }
}
