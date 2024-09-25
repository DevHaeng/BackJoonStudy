import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] s = new int[n];
        int[] c = new int[n];
        int[] l = new int[n];

        int win = -1;
        int score = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            s[i] = Integer.parseInt(st.nextToken());
            c[i] = Integer.parseInt(st.nextToken());
            l[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            if (s[i] > score) {
                score = s[i];
                win = i;
            } else if (s[i] == score) {
                if (c[i] < c[win]) {
                    win = i;
                } else if (c[i] == c[win]) {
                    if (l[i] < l[win]) {
                        win = i;
                    }
                }
            }
        }
        System.out.println(win + 1);
    }
}