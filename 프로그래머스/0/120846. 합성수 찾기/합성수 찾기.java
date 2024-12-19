class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
            if (count(i) >= 3) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private int count(int num) {
        int cnt = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}