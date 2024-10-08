import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        ArrayList<String> zero = new ArrayList<>();
        ArrayList<String> one = new ArrayList<>();

        String list = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (list.isEmpty()) {
                list += c;
            } else {
                char c2 = list.charAt(0);
                if (c2 == c) {
                    list += c;
                } else {
                    if (c2 == '0') {
                        zero.add(list);
                    } else {
                        one.add(list);
                    }
                    list = "";
                    list += c;
                }
            }
        }

        if (!list.isEmpty()) {
            if (list.charAt(0) == '0') {
                zero.add(list);
            } else {
                one.add(list);
            }
        }

        int result = Math.min(zero.size(), one.size());
        System.out.println(result);
    }
}