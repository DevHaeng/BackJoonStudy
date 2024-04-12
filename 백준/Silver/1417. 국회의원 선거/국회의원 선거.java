import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int dasom = Integer.parseInt(br.readLine());
        ArrayList<Integer> vote = new ArrayList<>();

        if (n == 1) {
            System.out.println(0);
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            vote.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(vote);
        int max = vote.get(n - 2);
        int count = 0;

        if (dasom > max) {
            System.out.println(count);
            return;
        }

        while (true) {
            if (max < dasom) break;
            int temp = vote.get(n - 2);
            temp -= 1;
            dasom += 1;
            count++;
            vote.set(n - 2, temp);
            Collections.sort(vote);
            max = vote.get(n - 2);
        }
        System.out.println(count);
    }
}
