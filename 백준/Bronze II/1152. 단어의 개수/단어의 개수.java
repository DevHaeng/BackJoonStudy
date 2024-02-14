import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sentence = br.readLine().trim();
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (!Character.isWhitespace(sentence.charAt(i))) {
                count++;
                while (i < sentence.length() - 1 && !Character.isWhitespace(sentence.charAt(i + 1))) {
                    i++;
                }
            }
        }
        System.out.println(count);
    }
}