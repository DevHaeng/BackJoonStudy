import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            int check = isPalindrome(s);
            System.out.println(check + " " + cnt);
            cnt = 0;
        }
    }

    private static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }

    private static int recursion(String s, int l, int r) {
        cnt++;
        if (l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
}