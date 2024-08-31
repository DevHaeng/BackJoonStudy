import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] students = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            students[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();

        int index = 0, num = 1;
        while (index < n) {
            if (students[index] == num) {
                num++;
                index++;
            } else if (!stack.isEmpty() && stack.peek() == num){
                stack.pop();
                num++;
            } else {
                stack.push(students[index]);
                index++;
            }
        }

        while (!stack.isEmpty() && stack.peek() == num) {
            stack.pop();
            num++;
        }

        if (num == n + 1) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
        
    }
}
