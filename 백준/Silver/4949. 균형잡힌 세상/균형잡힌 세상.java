import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String balance = br.readLine();
            if (balance.equals(".")) break;

            Stack<Character> stack = new Stack<>();
            boolean isBalance = true;

            for (char c : balance.toCharArray()) {
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')' || c == ']') {
                    if (stack.isEmpty()) {
                        isBalance = false;
                        break;
                    }
                    char top = stack.pop();
                    if ((top == '(' && c != ')') || (top == '[' && c != ']')) {
                        isBalance = false;
                        break;
                    }
                }
            }

            if (isBalance && stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}