import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n = 0, m = 0;
    static int result = 0;
    static int[] information = new int[3];
    static int[] surveillance = new int[3];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            information[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            surveillance[i] = Integer.parseInt(st.nextToken());
        }
        recursion(0,0,-1);

        System.out.println(result);
    }

    private static void recursion(int day, int score, int last_location) {
        if (day == n) {
            if (score >= m) result++;
            return;
        }

        for (int location = 0; location < 3; location++) {
            for (int mission = 0; mission < 2; mission++) {
                int getScore = (mission == 0) ? information[location] : surveillance[location];

                if (location == last_location) {
                    getScore /= 2;
                }

                recursion(day + 1, score + getScore, location);
            }
        }
    }
}