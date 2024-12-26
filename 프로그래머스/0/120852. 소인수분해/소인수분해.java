import java.util.*;

class Solution {
    public List<Integer> solution(int n) {
        Set<Integer> primeFactors = new HashSet<>();

        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }

        if (n > 1) {
            primeFactors.add(n);
        }

        List<Integer> result = new ArrayList<>(primeFactors);
        Collections.sort(result);
        return result;
    }
}
