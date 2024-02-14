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

            int numR = Integer.parseInt(st.nextToken());
            String stringS = st.nextToken();

            StringBuilder resultP = new StringBuilder();

            for (int j = 0; j < stringS.length(); j++) {
                char word = stringS.charAt(j);
                for (int k = 0; k < numR; k++) {
                    resultP.append(word);
                }
            }
            System.out.println(resultP.toString());
        }

    }
}