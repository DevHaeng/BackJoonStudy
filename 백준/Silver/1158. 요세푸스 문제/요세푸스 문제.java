import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        Queue<Integer> circle = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            circle.add(i);
        }

        int cnt = 0;
        while (!circle.isEmpty()) {
            int num = circle.poll();
            cnt++;
            if (cnt == k) {
                result.add(num);
                cnt = 0;
            } else {
                circle.add(num);
            }
        }
        System.out.print("<");
        for (int i = 0; i < result.size(); i++) {
            if (i == result.size() - 1) {
                System.out.print(result.get(i) + ">");
            } else {
                System.out.print(result.get(i) + ", ");
            }
        }
    }
}