class Solution {
    public int[] solution(int[] num_list) {
        int num = 0;
        int len = num_list.length;
        
        if (num_list[len - 1] > num_list[len - 2]) {
            num = num_list[len - 1] - num_list[len - 2];
        } else {
            num = num_list[len - 1] * 2;
        }
        
        int[] answer = new int[len + 1];
        for(int i = 0; i < len; i++) {
            answer[i] = num_list[i];
        }
        answer[len] = num;
        return answer;
    }
}