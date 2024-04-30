import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        int[] hot = new int[N];
        int[] sweet = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            hot[i] = Integer.parseInt(st.nextToken());
            sweet[i] = Integer.parseInt(st.nextToken());
        }

        int[] favoriteMenu = new int[Q];

        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j = 0; j < N; j++) {
                if (hot[j] >= u && hot[j] <= v && sweet[j] >= x && sweet[j] <= y) {
                    favoriteMenu[i]++;
                }
            }
        }

        for (int i = 0; i < Q; i++) {
            System.out.println(favoriteMenu[i]);
        }
    }
}
