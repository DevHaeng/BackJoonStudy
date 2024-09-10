import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] scores = {100, 100, 200, 200, 300, 300, 400, 400, 500};

        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean isHacker = false;
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (n > scores[i]) isHacker = true;
            sum += n;
        }

        if (isHacker) {
            System.out.println("hacker");
        } else if (sum >= 100) {
            System.out.println("draw");
        } else {
            System.out.println("none");
        }
    }
}