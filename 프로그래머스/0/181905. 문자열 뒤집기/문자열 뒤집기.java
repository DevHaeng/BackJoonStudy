class Solution {
    public String solution(String my_string, int s, int e) {
        String before = my_string.substring(0, s);
        String toReverse = my_string.substring(s, e + 1);
        String after = my_string.substring(e + 1);
        
        String reversed = new StringBuilder(toReverse).reverse().toString();

        return before + reversed + after;
    }
}
