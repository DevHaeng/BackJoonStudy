import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String[] leader = new String[n];
            int max = -1, idx = -1;
            for (int j = 0; j < n; j++) {
                leader[j] = br.readLine();
                HashSet<Character> check = new HashSet<>();

                for (int k = 0; k < leader[j].length(); k++) {
                    char c = leader[j].charAt(k);
                    if (c != ' ') check.add(c);
                }
                if (check.size() > max) {
                    max = check.size();
                    idx = j;
                } else if (check.size() == max) {
                    if (leader[j].compareTo(leader[idx]) < 0) {
                        idx = j;
                    }
                }
            }
            System.out.println("Case #" + (i + 1) + ": " + leader[idx]);
        }
    }
}
