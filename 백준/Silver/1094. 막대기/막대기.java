import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        ArrayList<Integer> stick = new ArrayList<>();
        stick.add(64);

        while (true) {
            int sum = 0;
            for (int i = 0; i < stick.size(); i++) {
                sum += stick.get(i);
            }
            if (sum == x) {
                System.out.println(stick.size());
                break;
            } else if (sum > x) {
                int shortStick = stick.get(stick.size() - 1);
                stick.remove(stick.size() - 1);
                int half = shortStick / 2;
                stick.add(half);
                if (sum - half >= x) continue;
            } else {
                stick.add(stick.get(stick.size() - 1) / 2);
            }
        }
    }
}