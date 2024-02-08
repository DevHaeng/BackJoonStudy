import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> num = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < 10; i++) {
            boolean check = true;
            num.add(sc.nextInt()%42);

            for (int j = 0; j < i; j++) {
                if (num.get(i).equals(num.get(j))) {
                    check = false;
                    break;
                }
            }
            if (check){
                count +=1;
            }
        }
        System.out.println(count);
    }

}