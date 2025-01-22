import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        List<Integer> result = new ArrayList<>();

        if (n == 1) {
            for (int i = 0; i <= b; i++) {
                result.add(num_list[i]);
            }
        } else if (n == 2) {
            for (int i = a; i < num_list.length; i++) {
                result.add(num_list[i]);
            }
        } else if (n == 3) {
            for (int i = a; i <= b; i++) {
                result.add(num_list[i]);
            }
        } else if (n == 4) {
            for (int i = a; i <= b; i += c) {
                result.add(num_list[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int n1 = 3;
        int[] slicer1 = {1, 5, 2};
        int[] num_list1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sol.solution(n1, slicer1, num_list1)); 

        int n2 = 4;
        int[] slicer2 = {1, 5, 2};
        int[] num_list2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sol.solution(n2, slicer2, num_list2)); 
    }
}
