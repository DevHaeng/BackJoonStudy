import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> solution(int start_num, int end_num) {
        List<Integer> result = new ArrayList<>();
        for (int i = start_num; i >= end_num; i--) {
            result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(10, 3));
    }
}
