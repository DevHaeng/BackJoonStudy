class Solution {
    public int solution(int order) {
        int clapCount = 0;

        String orderStr = String.valueOf(order);

        for (char c : orderStr.toCharArray()) {
            if (c == '3' || c == '6' || c == '9') {
                clapCount++;
            }
        }

        return clapCount;
    }
}
