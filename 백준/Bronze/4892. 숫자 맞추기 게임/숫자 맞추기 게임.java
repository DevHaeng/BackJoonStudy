import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 1; 

        while (true) {
            int n0 = Integer.parseInt(br.readLine());
            if (n0 == 0) break;

            int n1 = 3 * n0;
            boolean isEven = (n1 % 2 == 0);
            int n2 = isEven ? n1 / 2 : (n1 + 1) / 2;
            int n3 = 3 * n2;
            int n4 = n3 / 9;

            if (isEven) {
                System.out.println(num + ". even " + n4);
            } else {
                System.out.println(num + ". odd " + n4);
            }

            num++;
        }
    }
}