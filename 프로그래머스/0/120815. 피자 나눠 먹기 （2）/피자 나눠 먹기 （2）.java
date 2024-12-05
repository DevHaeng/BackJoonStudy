class Solution {
    public int solution(int n) {
        int slice = 6;
        int lcm = lcm(slice, n);
        
        int answer = lcm / slice;
        return answer;
    }
    
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}