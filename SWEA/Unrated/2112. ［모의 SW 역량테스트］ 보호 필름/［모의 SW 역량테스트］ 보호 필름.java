import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


class Solution {
    private static int d, w, k;
    private static int[][] film;
    private static int min;
	public static void main(String args[]) throws Exception {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int testCase = 0; testCase < t; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            d = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            film = new int[13][20];
            for (int i = 0; i < d; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    film[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            sb.append("#").append(testCase + 1).append(" ");
            if (k == 1) {
                sb.append("0\n");
                continue;
            }
            min = 13;
            dfs(0,0);
            sb.append(min).append("\n");
        }
        System.out.println(sb);
    }
    private static boolean isPass() {
        for (int i = 0; i < w; i++) {
            int performance = 1;
            boolean isTrue = false;
            for (int j = 1; j < d; j++) {
                if (film[j][i] == film[j - 1][i]) {
                    if (++performance == k) {
                        isTrue = true;
                        break;
                    }
                } else {
                    performance = 1;
                }
            }
            if (!isTrue) return false;
        }
        return true;
    }

    private static void dfs(int cnt, int row) {
        if (cnt >= min) return;

        if (row == d) {
            if(!isPass()) return;
            min = Math.min(min, cnt);
            return;
        }

        dfs(cnt, row + 1);

        int[] temp = Arrays.copyOf(film[row], w);

        Arrays.fill(film[row], 0);
        dfs(cnt + 1, row + 1);

        Arrays.fill(film[row], 1);
        dfs(cnt + 1, row + 1);

        film[row] = temp;
    }
}