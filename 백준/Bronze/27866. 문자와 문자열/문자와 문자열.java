import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String word = st.nextToken();

        st = new StringTokenizer(br.readLine());
        int number = Integer.parseInt(st.nextToken());

        char result = word.charAt(number - 1);
        System.out.println(result);
    }
}