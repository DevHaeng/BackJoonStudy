class Solution {
    public String solution(String my_string) {
        String vowels = "aeiou";
        StringBuilder result = new StringBuilder();

        for (char c : my_string.toCharArray()) {
            if (!vowels.contains(String.valueOf(c))) {
                result.append(c);
            }
        }

        return result.toString();
    }
}