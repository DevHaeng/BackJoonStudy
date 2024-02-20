import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        int length = word.length();
        boolean palindrome = true;

        for (int i = 0; i < length / 2; i++) {
            char firstWord = word.charAt(i);
            char lastWord = word.charAt(length - i - 1);

            if (firstWord != lastWord) {
                palindrome = false;
                break;
            }
        }
        System.out.println(palindrome ? 1 : 0);
    }
}