import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> suffixes = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            suffixes.add(my_string.substring(i));
        }

        Collections.sort(suffixes);

        return suffixes.toArray(new String[0]);
    }
}
