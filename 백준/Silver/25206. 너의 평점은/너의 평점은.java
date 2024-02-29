import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> subjects = new ArrayList<>();
        ArrayList<Double> credits = new ArrayList<>();
        ArrayList<String> grades = new ArrayList<>();

        int subjectNum = 20;

        for (int i = 0; i < subjectNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            subjects.add(st.nextToken());
            credits.add(Double.parseDouble(st.nextToken()));
            grades.add(st.nextToken());
        }

        Double sumCredit = 0.0;

        for (int i = 0; i < subjectNum; i++) {
            if (grades.get(i).equals("P")) {
                sumCredit += 0.0;
            } else {
                sumCredit += credits.get(i);
            }
        }

        Double sumGrade = 0.0;

        for (int i = 0; i < subjectNum; i++) {
            if (grades.get(i).equals("A+")) {
                sumGrade += 4.5 * credits.get(i);
            } else if (grades.get(i).equals("A0")) {
                sumGrade += 4.0 * credits.get(i);
            } else if (grades.get(i).equals("B+")) {
                sumGrade += 3.5 * credits.get(i);
            } else if (grades.get(i).equals("B0")) {
                sumGrade += 3.0 * credits.get(i);
            } else if (grades.get(i).equals("C+")) {
                sumGrade += 2.5 * credits.get(i);
            } else if (grades.get(i).equals("C0")) {
                sumGrade += 2.0 * credits.get(i);
            } else if (grades.get(i).equals("D+")) {
                sumGrade += 1.5 * credits.get(i);
            } else if (grades.get(i).equals("D0")) {
                sumGrade += 1.0 * credits.get(i);
            } else if (grades.get(i).equals("F")) {
                sumGrade += 0.0 * credits.get(i);
            } else {
                sumGrade += 0.0;
            }
        }
        Double total = sumGrade / sumCredit;
        System.out.println(total);
    }
}
