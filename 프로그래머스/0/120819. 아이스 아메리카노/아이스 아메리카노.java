class Solution {
    public int[] solution(int money) {        
        int coffee = money / 5500;
        int result = money % 5500;
        
        int[] answer = {coffee, result};
        
        return answer;
    }
}