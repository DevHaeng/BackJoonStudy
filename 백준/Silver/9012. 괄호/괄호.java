import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            Stack<String> stack = new Stack<>();
            boolean vps = true;
            for (int j = 0; j < s.length(); j++) {
                String check = String.valueOf(s.charAt(j));
                if (check.equals("(")) {
                    stack.push(check);
                } else {
                    if (stack.isEmpty()) {
                        vps = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (vps && stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}