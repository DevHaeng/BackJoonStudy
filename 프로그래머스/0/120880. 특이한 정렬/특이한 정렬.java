import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] numlist, int n) {
        return Arrays.stream(numlist)
                .boxed()
                .sorted(Comparator
                        .comparingInt((Integer num) -> Math.abs(num - n)) 
                        .thenComparing(Comparator.reverseOrder()))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
