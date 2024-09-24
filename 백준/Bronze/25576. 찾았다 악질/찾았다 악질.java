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

        int[] lalpa = new int[m];
        int total = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            lalpa[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int[] viewer = new int[m];
            for (int j = 0; j < m; j++) {
                viewer[j] = Integer.parseInt(st.nextToken());
            }
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += Math.abs(lalpa[j] - viewer[j]);
            }
            if (sum > 2000) total++;
        }

        if (total >= n / 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}