import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] name = new String[n];
        int[] day = new int[n];
        int[] month = new int[n];
        int[] year = new int[n];

        int  young = 0, old = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            name[i] = st.nextToken();
            day[i] = Integer.parseInt(st.nextToken());
            month[i] = Integer.parseInt(st.nextToken());
            year[i] = Integer.parseInt(st.nextToken());


            if (year[i] > year[young] || (year[i] == year[young] && month[i] > month[young]) || (year[i] == year[young] && month[i] == month[young] && day[i] > day[young])) {
                young = i;
            }

            if (year[i] < year[old] || (year[i] == year[old] && month[i] < month[old]) || (year[i] == year[old] && month[i] == month[old] && day[i] < day[old])) {
                old = i;
            }

        }
        System.out.println(name[young]);
        System.out.println(name[old]);
    }
}
