import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = 0, o = 0, v = 0, e = 0;
        String yeondu = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int[] win = new int[n];

        for (int i = 0; i < yeondu.length(); i++) {
            char c = yeondu.charAt(i);
            if (c == 'L') l++;
            if (c == 'O') o++;
            if (c == 'V') v++;
            if (c == 'E') e++;
        }

        int max = Integer.MIN_VALUE;
        String winTeam = null;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int yeonduL = l;
            int yeonduO = o;
            int yeonduV = v;
            int yeonduE = e;
            String team = br.readLine();
            for (int j = 0; j < team.length(); j++) {
                char c = team.charAt(j);
                if (c == 'L') l++;
                if (c == 'O') o++;
                if (c == 'V') v++;
                if (c == 'E') e++;
            }
            sum = ((l + o) * (l + v) * (l + e) * (o + v) * (o + e) * (v + e)) % 100;
            if (sum > max || (sum == max && (winTeam == null || team.compareTo(winTeam) < 0))) {
                max = sum;
                winTeam = team;
            }
            l = yeonduL;
            o = yeonduO;
            v = yeonduV;
            e = yeonduE;
        }

        System.out.println(winTeam);
    }
}