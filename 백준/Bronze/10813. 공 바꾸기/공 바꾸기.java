import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int number = Integer.parseInt(st.nextToken());
        int exchange = Integer.parseInt(st.nextToken());

        ArrayList<Integer> basket = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            basket.add(i);
        }

        for (int i = 0; i < exchange; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;

            int temp = basket.get(a);
            basket.set(a, basket.get(b));
            basket.set(b, temp);

        }

        for (Integer i : basket) {
            System.out.print(i + " ");
        }
        br.close();
    }
}