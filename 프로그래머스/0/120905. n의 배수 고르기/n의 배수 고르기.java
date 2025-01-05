import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> resultList = new ArrayList<>();

        for (int num : numlist) {
            if (num % n == 0) {
                resultList.add(num);
            }
        }

        return resultList.stream().mapToInt(i -> i).toArray();
    }
}
