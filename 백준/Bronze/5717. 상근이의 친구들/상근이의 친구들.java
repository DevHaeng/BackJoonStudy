import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int boy = Integer.parseInt(st.nextToken());
            int girl = Integer.parseInt(st.nextToken());
            
            if (boy == 0 && girl == 0) break;
            
            int sum = boy + girl;
            System.out.println(sum);
        }
    }
}