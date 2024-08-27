import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] num = new int[k];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        dfs(num, 0, n);

        System.out.println(result);
    }

    private static void dfs(int[] num, int number, int n) {
        if (number > n) {
            return;
        }
        result = Math.max(result, number);

        for (int i = 0; i < num.length; i++) {
            dfs(num, number * 10 + num[i], n);
        }
    }
}
