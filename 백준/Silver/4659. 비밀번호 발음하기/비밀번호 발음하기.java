import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String password = br.readLine();
            if (password.equals("end")) break;

            boolean restrictionOne = false;
            boolean restrictionTwo = true;
            boolean restrictionThree = false;
            int vowel = 0;
            int consonant = 0;

            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    restrictionOne = true;
                    vowel++;
                    consonant = 0;
                    if (vowel >= 3) restrictionTwo = false;
                } else {
                    consonant++;
                    vowel = 0;
                    if (consonant >= 3) restrictionTwo = false;
                }

                if (i != password.length() - 1) {
                    char c2 = password.charAt(i + 1);
                    if (c == c2) {
                        if (c == 'e' || c == 'o') {
                            restrictionThree = true;
                        } else {
                            restrictionThree = false;
                            break;
                        }
                    } else {
                        restrictionThree = true;
                    }
                } else if (password.length() == 1) {
                    restrictionThree = true;
                }
            }

            if (restrictionOne && restrictionTwo && restrictionThree) {
                System.out.println("<" + password + ">" + " is acceptable.");
            } else {
                System.out.println("<" + password + ">" + " is not acceptable.");
            }
        }
    }
}