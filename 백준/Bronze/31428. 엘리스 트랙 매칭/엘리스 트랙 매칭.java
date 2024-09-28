import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] friends = new String[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            friends[i] = st.nextToken();
        }
        String helloBit = br.readLine();

        int same = 0;

        for (int i = 0; i < n; i++) {
            if(friends[i].equals(helloBit)) same++;
        }
        System.out.println(same);
    }
}