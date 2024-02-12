import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine().trim());

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < testCase; i++) {
            String word = br.readLine().trim();

            char firstWord = word.charAt(0);
            char lastWord = word.charAt(word.length() - 1);

            result.append(firstWord).append(lastWord).append("\n");
        }
        System.out.println(result);
    }
}