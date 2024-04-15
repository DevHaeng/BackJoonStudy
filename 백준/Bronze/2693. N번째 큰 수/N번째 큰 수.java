import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int caseNum = 10;
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < caseNum; j++) {
                numbers.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(numbers);
            System.out.println(numbers.get(caseNum - 3));
            numbers.clear();
        }
    }
}
