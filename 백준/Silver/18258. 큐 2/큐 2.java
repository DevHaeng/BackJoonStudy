import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if (s.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                queue.add(num);
            } else if (s.equals("pop")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(queue.poll()).append('\n');
                }
            } else if (s.equals("size")) {
                sb.append(queue.size()).append('\n');
            } else if (s.equals("empty")) {
                sb.append(queue.isEmpty() ? 1 : 0).append('\n');
            } else if (s.equals("front")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(queue.peek()).append('\n');
                }
            } else if (s.equals("back")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(queue.getLast()).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}