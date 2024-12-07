class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        int pizza = slice;
        if(slice / n <= 1) {
        }
        while(true) {
            if(pizza / n < 1) {
                pizza += slice;
                answer += 1;
            } else {
                break;
            }
        }
        return answer;
    }
}