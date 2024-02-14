import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());
            String newString = st.nextToken();

            StringBuilder result = new StringBuilder();

            for (int j = 0; j < newString.length(); j++) {
                char word = newString.charAt(j);
                for (int k = 0; k < num; k++) {
                    result.append(word);
                }
            }
            System.out.println(result.toString());
        }

    }
}