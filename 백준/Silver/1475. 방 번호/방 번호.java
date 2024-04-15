import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int[] set = new int[10];

        for (int i = 0; i < n.length(); i++) {
            int num = n.charAt(i) - '0';
            set[num] += 1;
        }

        double temp = (double) (set[6] + set[9]) / 2;
        set[6] = (int) Math.ceil(temp);
        int max = 0;

        for (int i = 0; i < 9; i++) {
            if (set[i] > max) {
                max = set[i];
            }
        }

        System.out.println(max);
    }
}
