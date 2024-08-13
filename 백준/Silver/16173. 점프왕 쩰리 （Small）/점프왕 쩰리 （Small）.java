import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] map = new int[n][n];
        boolean[][] visit = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        if (DFS(map, visit, n, 0, 0)) {
            System.out.println("HaruHaru");
        } else {
            System.out.println("Hing");
        }
    }

    private static boolean DFS(int[][] map, boolean[][] visit, int n, int x, int y) {
        if (map[x][y] == -1) return true;

        if (visit[x][y]) return false;

        visit[x][y] = true;
        int num = map[x][y];

        if (x + num < n) {
            if (DFS(map, visit, n, x + num, y)) {
                return true;
            }
        }

        if (y + num < n) {
            if (DFS(map, visit, n, x, y + num)) {
                return true;
            }
        }
        return false;
    }
}