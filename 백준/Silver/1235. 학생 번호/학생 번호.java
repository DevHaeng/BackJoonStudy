import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] student = new String[n];

        for (int i = 0; i < n; i++) {
            student[i] = br.readLine();
        }

        int start = 0;
        int end = student[0].length();
        int result = end;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (isUnique(student, mid)) {
                end = mid - 1;
                result = mid;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(result);
    }
    
    private static boolean isUnique(String[] student, int k) {
        Set<String> set = new HashSet<>();

        for (String s : student) {
            String cut = s.substring(s.length() - k);
            if (!set.add(cut)) {
                return false;
            }
        }
        return true;
    }
}