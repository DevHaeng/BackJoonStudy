import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> solution(String[] str_list) {
        List<String> result = new ArrayList<>();
        
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                for (int j = 0; j < i; j++) {
                    result.add(str_list[j]);
                }
                return result; 
            } else if (str_list[i].equals("r")) {
                for (int j = i + 1; j < str_list.length; j++) {
                    result.add(str_list[j]);
                }
                return result; 
            }
        }

        return result;
    }
}
