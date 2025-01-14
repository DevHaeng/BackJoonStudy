import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);
        String target = String.join("", spell); 

        for (String word : dic) {
            char[] wordArr = word.toCharArray();
            Arrays.sort(wordArr); 
            if (target.equals(new String(wordArr))) {
                return 1; 
            }
        }

        return 2;
    }
}
