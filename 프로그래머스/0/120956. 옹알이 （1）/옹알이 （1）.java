class Solution {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        int count = 0;

        for (String b : babbling) {
            String temp = b;
            for (String word : words) {
                temp = temp.replace(word, " ");
            }
            if (temp.trim().isEmpty()) {
                count++;
            }
        }
        return count;
    }
}
