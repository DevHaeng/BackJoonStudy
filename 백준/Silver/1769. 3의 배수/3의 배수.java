import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();

        int count = 0;
        
        while (x.length() > 1) {
            int sum = 0;
            for (int i = 0; i < x.length(); i++) {
                sum += x.charAt(i) - '0';
            }
            x = String.valueOf(sum);
            count++;
        }

        int result = Integer.parseInt(x);

        if (result % 3 == 0) {
            System.out.println(count);
            System.out.println("YES");
        } else {
            System.out.println(count);
            System.out.println("NO");
        }
    }
}
