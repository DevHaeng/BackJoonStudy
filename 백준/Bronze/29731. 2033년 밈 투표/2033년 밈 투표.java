import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = {
                "Never gonna give you up",
                "Never gonna let you down",
                "Never gonna run around and desert you",
                "Never gonna make you cry",
                "Never gonna say goodbye",
                "Never gonna tell a lie and hurt you",
                "Never gonna stop"
        };

        boolean isModified = false;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            boolean found = false;
            for (String original : arr) {
                if (original.equals(s)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                isModified = true;
                break;
            }
        }

        if (isModified) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}