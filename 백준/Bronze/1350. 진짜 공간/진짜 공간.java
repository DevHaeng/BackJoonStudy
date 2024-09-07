import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] file = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            file[i] = Integer.parseInt(st.nextToken());
        }

        int cluster = Integer.parseInt(br.readLine());

        long disk = 0;
        for (int i = 0; i < file.length; i++) {
            if (file[i] != 0) {
                disk += file[i] / cluster;
                if ((file[i] % cluster) > 0) {
                    disk++;
                }
            }
        }

        System.out.println(cluster * disk);
    }
}
