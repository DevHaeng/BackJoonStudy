class Solution {
    public int solution(int[] sides) {
        int a = Math.min(sides[0], sides[1]);
        int b = Math.max(sides[0], sides[1]);

        int count1 = b - (b - a);

        int count2 = (a + b - 1) - b;

        return count1 + count2;
    }
}
