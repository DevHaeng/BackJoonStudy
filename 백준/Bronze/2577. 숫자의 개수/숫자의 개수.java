import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int result = a * b * c;
        String s = String.valueOf(result);
        int[] list = new int[10];
        for (int i = 0; i < s.length(); i++) {
            list[Integer.parseInt(String.valueOf(s.charAt(i)))]++;
        }

        for (int i : list) {
            System.out.println(i);
        }
    }
}