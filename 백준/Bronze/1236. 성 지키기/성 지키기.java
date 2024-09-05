import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] castle = new char[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                castle[i][j] = c;
            }
        }

        int rowGuards = 0;
        int colGuards = 0;

        for (int i = 0; i < n; i++) {
            boolean hasGuard = false;
            for (int j = 0; j < m; j++) {
                if (castle[i][j] == 'X') {
                    hasGuard = true;
                    break;
                }
            }
            if (!hasGuard) {
                rowGuards++;
            }
        }

        for (int j = 0; j < m; j++) {
            boolean hasGuard = false;
            for (int i = 0; i < n; i++) {
                if (castle[i][j] == 'X') {
                    hasGuard = true;
                    break;
                }
            }
            if (!hasGuard) {
                colGuards++;
            }
        }

        System.out.println(Math.max(rowGuards, colGuards));
    }
}