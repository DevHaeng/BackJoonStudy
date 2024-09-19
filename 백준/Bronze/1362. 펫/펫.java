import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int seq = 1;  

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int o = Integer.parseInt(st.nextToken());  
            int w = Integer.parseInt(st.nextToken());  

            if (o == 0 && w == 0) break; 

            boolean isDead = false;  

            while (true) {
                st = new StringTokenizer(br.readLine());
                String action = st.nextToken();
                int n = Integer.parseInt(st.nextToken());

                if (action.equals("#") && n == 0) break;  

                if (isDead) continue;  

                if (action.equals("F")) {
                    w += n;  
                } else if (action.equals("E")) {
                    w -= n;  
                }

                if (w <= 0) isDead = true;  
            }
            
            if (isDead) {
                System.out.println(seq + " RIP");
            } else if (w > o / 2 && w < o * 2) {
                System.out.println(seq + " :-)");
            } else {
                System.out.println(seq + " :-(");
            }

            seq++; 
        }
    }
}