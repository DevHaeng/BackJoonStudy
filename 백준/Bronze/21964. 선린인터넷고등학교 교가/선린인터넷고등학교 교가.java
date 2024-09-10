import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String s = br.readLine();

        for (int i = s.length() - 5; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.print(c);
        }
    }
}