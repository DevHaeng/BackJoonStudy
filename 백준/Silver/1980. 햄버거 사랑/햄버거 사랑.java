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
        int t = Integer.parseInt(st.nextToken());

        int minCokeTime = Integer.MAX_VALUE;

        int maxBurger = 0;

        if (n > m) {
            int temp = m;
            m = n;
            n = temp;
        }
        
        for (int nBurger = 0; nBurger <= t / n; nBurger++) {
            int breakTime = t - nBurger * n;
            int mBurger = breakTime / m;
            int cokeTime = breakTime % m;

            if (cokeTime <= minCokeTime) {
                minCokeTime = cokeTime;
                maxBurger = nBurger + mBurger;
            }
        }

        System.out.println(maxBurger + " " + minCokeTime);
    }
}