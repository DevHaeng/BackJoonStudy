import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double[] scores = new double[n];

        for (int i = 0; i < n; i++) {
            scores[i] = Double.parseDouble(br.readLine());
        }

        Arrays.sort(scores);

        for (int i = 0; i < 7; i++) {
            System.out.printf("%.3f\n", scores[i]);
        }
    }
}