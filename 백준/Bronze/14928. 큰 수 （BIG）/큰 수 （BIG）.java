import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine(); 
        int mod = 20000303;

        int result = 0;
        for (int i = 0; i < n.length(); i++) {
            result = (result * 10 + (n.charAt(i) - '0')) % mod;
        }

        System.out.println(result);
    }
}