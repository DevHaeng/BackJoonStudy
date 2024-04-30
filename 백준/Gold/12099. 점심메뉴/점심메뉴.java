import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 점심 메뉴의 수
        int Q = Integer.parseInt(st.nextToken()); // 점심을 같이 먹는 기간
        int[] hot = new int[N];
        int[] sweet = new int[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            hot[i] = Integer.parseInt(st.nextToken());
            sweet[i] = Integer.parseInt(st.nextToken());
        }

        int[] sameMenu = new int[Q];

        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j = 0; j < N; j++) {
                if (hot[j] >= u && hot[j] <= v && sweet[j] >= x && sweet[j] <= y) {
                    sameMenu[i]++;
                }
            }
            // 각 날의 매운맛 구간[u, v], 단맛 구간[x, y]
        }
        for (int i = 0; i < Q; i++) {
            System.out.println(sameMenu[i]);
        }
        // Q개의 줄에 줄마다 각 날의 영우와 승관이가 둘 다 좋아하는 메뉴의 수를 출력
    }
}
