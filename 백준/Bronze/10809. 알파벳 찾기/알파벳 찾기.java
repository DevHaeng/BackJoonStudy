import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine().trim();

        ArrayList<Integer> positions = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            positions.add(-1);
        }

        for (int i = 0; i < word.length(); i++) {
            char place = word.charAt(i);
            int index = place - 'a';

            if(positions.get(index) == -1) {
                positions.set(index, i);
            }
        }

        for (Integer position : positions) {
            System.out.print(position + " ");
        }
    }
}