import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = l; i <= r; i++) {
            if (isValid(i)) {
                answer.add(i);
            }
        }
        
        if(answer.isEmpty()) {
            return new int[]{-1};
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    private boolean isValid(int n) {
        String s = Integer.toString(n);
        for(char c : s.toCharArray()) {
            if (c != '0' && c != '5') {
                return false;
            }
        }
        return true;
    }
}