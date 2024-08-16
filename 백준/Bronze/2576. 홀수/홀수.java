import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[7];

        for (int i = 0; i < 7; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 1) {
                sum += num[i];
                min = Math.min(min, num[i]);
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
