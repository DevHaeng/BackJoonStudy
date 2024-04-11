import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] scores = new int[n][3];
        int[][] candidates = new int[3][3];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                scores[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                if (scores[i][j] == 3) {
                    candidates[j][2]++;
                } else if (scores[i][j] == 2) {
                    candidates[j][1]++;
                } else {
                    candidates[j][0]++;
                }
            }
        }

        int sum = 0;
        int max = 0;
        int chairman = 0;
        int temp = 0;

        for (int i = 0; i < 3; i++) {
            sum = (candidates[i][0]) + (candidates[i][1] * 2) + (candidates[i][2] * 3);
            if (sum > max) {
                chairman = i;
                max = sum;
                temp = 0;
            } else if (sum == max) {
                if (candidates[i][2] > candidates[chairman][2]) {
                    chairman = i;
                    temp = 0;
                } else if (candidates[i][2] == candidates[chairman][2]) {
                    if (candidates[i][1] > candidates[chairman][1]) {
                        chairman = i;
                        temp = 0;
                    } else if (candidates[i][1] == candidates[chairman][1]) {
                        temp = -1;
                    }
                }
            }
        }

        if (temp == -1) {
            System.out.println("0 " + max);
        } else {
            System.out.println((chairman + 1) + " " + max);
        }
    }
}