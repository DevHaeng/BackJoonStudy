import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int k) {
        List<Integer> multiples = new ArrayList<>();

        for (int i = k; i <= n; i += k) {
            multiples.add(i);
        }

        return multiples.stream().mapToInt(Integer::intValue).toArray();
    }
}
