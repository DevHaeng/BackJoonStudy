import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String room = "0";
            if (s.equals("Algorithm")) {
                room = "204";
            } else if (s.equals("DataAnalysis")) {
                room = "207";
            } else if (s.equals("ArtificialIntelligence")) {
                room = "302";
            } else if (s.equals("CyberSecurity")) {
                room = "B101";
            } else if (s.equals("Network")) {
                room = "303";
            } else if (s.equals("Startup")) {
                room = "501";
            } else if (s.equals("TestStrategy")) {
                room = "105";
            }
            System.out.println(room);
        }
    }
}
