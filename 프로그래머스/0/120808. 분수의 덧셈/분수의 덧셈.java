class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int lcm = denom1 * denom2;
        
        int numerator = (numer1 * denom2) + (numer2 * denom1);
        int denominator = lcm;
        
        int gcd = gcd(numerator, denominator);
        
        numerator /= gcd;
        denominator /= gcd;
        
        return new int[] {numerator, denominator};
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    
}