import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        int f = Integer.parseInt(br.readLine());

        String tryNum = "";

        for (int i = 0; i < n.length() - 2; i++) {
            tryNum += String.valueOf(n.charAt(i));
            if (i == n.length() - 3) tryNum += "00";
        }

        int tryNumber = Integer.parseInt(tryNum);

        while (true) {
            if (tryNumber % f == 0) {
                tryNum = String.valueOf(tryNumber);
                for (int i = tryNum.length() - 2; i < tryNum.length(); i++) {
                    System.out.print(tryNum.charAt(i));
                }
                break;
            } else {
                tryNumber++;
            }
        }
    }
}
