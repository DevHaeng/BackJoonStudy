import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String code = br.readLine().trim();

        for (int i = 0; i < code.length(); i++) {
            char ascii = code.charAt(i);

            System.out.println((int) ascii);
        }

    }
}