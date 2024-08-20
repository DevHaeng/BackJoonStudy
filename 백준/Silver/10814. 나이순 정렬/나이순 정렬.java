import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Member> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();;

            Member member = new Member(i, age, name);
            list.add(member);
        }

        list.sort((m1, m2) -> {
            if (m1.age != m2.age) {
                return Integer.compare(m1.age, m2.age);
            }
            return Integer.compare(m1.join, m2.join);
        });

        StringBuilder sb = new StringBuilder();
        for (Member member : list) {
            sb.append(member.age).append(" ").append(member.name).append("\n");
        }
        System.out.print(sb.toString());
    }

    static class Member {
        public int join;
        public int age;
        public String name;
        Member(int join, int age, String name) {
            this.join = join;
            this.age = age;
            this.name = name;
        }
    }
}