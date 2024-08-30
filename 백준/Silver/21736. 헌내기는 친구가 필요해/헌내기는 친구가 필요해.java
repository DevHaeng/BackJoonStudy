import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[][] campus = new String[n][m];
        boolean[][] visited = new boolean[n][m];

        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String[] chars = s.split("");
            for (int j = 0; j < m; j++) {
                campus[i][j] = chars[j];
                if (chars[j].equals("I")) {
                    x = i;
                    y = j;
                }
            }
        }

        boolean dfs = DFS(campus, visited, x, y, n, m);

        if (sum != 0) {
            System.out.println(sum);
        } else {
            System.out.println("TT");
        }

    }

    private static boolean DFS(String[][] campus, boolean[][] visited, int x, int y, int n, int m) {
        if (x < 0 || x >= n || y < 0 || y >= m || visited[x][y] || campus[x][y].equals("X")) return false;

        visited[x][y] = true;
        if (campus[x][y].equals("P")) sum++;

        if (DFS(campus, visited, x + 1, y, n, m)) {
            return true;
        }

        if (DFS(campus, visited, x - 1, y, n, m)) {
            return true;
        }

        if (DFS(campus, visited, x, y + 1, n, m)) {
            return true;
        }

        if (DFS(campus, visited, x, y - 1, n, m)) {
            return true;
        }

        return false;
    }

}
