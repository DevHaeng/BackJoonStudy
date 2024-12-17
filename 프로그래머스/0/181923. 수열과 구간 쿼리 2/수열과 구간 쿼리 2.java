class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            int min = Integer.MAX_VALUE;
            boolean found = false;
            
            for(int j = s; j <= e; j++) {
                if(arr[j] > k && arr[j] < min) {
                    min = arr[j];
                    found = true;
                }
            }
            result[i] = found ? min : -1;
        }
        return result;
    }
}