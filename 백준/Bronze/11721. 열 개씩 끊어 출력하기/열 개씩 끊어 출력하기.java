import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        int num = 1;
        for (int i = 0; i < word.length(); i++) {
            if (num <= 10) {
                System.out.print(word.charAt(i));
            } else {
                System.out.println();
                System.out.print(word.charAt(i));
                num = 1;
            }
            num++;
        }
    }
}