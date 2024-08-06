import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] distance = new int[n-1];
        for (int i = 0; i < n - 1; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }
        int[] cityOilPrice = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cityOilPrice[i] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;
        int check = 0;
        for (int i = 0; i < n; i++) {
            if (cityOilPrice[i] < min) {
                min = cityOilPrice[i];
                check = i;
            }
        }

        Long sum = 0L;
        if (cityOilPrice[0] == check) {
            for (int i = 0; i < n - 1; i++) {
                sum += (long) distance[i] * cityOilPrice[0];
            }
            System.out.println(sum);
            return;
        }

        min = cityOilPrice[0];
        for (int i = 0; i < n - 1; i++) {
            if (cityOilPrice[i] < min) {
                min = cityOilPrice[i];
            }

            sum += ((long) distance[i] * min);
        }
        System.out.println(sum);
    }
}
