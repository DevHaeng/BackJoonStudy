import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int[] userSound = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            userSound[i] = Integer.parseInt(st.nextToken());
        }

        int target = -1;

        while (true) {
            for (int i = 0; i < n; i++) {
                if (userSound[i] < t) {
                    target = i + 1;
                    break;
                } else {
                    t++;
                }
            }
            if (target > 0) break;
        }
        System.out.println(target);
    }
}