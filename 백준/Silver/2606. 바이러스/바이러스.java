import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[][] connection = new int[n + 1][n + 1];
        boolean[] check = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            connection[a][b] = connection[b][a] = 1;
        }

        virusCheck(connection, check, n, 1);

        System.out.println(cnt - 1);
    }

    private static void virusCheck(int[][] connection, boolean[] check, int n, int start) {
        check[start] = true;
        cnt++;

        for (int i = 1; i <= n; i++) {
            if (connection[start][i] == 1 && !check[i]) {
                virusCheck(connection, check, n, i);
            }
        }
    }
}
