class Solution {
    public int solution(int a, int b) {
        int gcd = gcd(a, b);
        int denominator = b / gcd; 

        while (denominator % 2 == 0) {
            denominator /= 2;
        }
        while (denominator % 5 == 0) {
            denominator /= 5;
        }

        return denominator == 1 ? 1 : 2;
    }

    private int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
