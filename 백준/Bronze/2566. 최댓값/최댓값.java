import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] numbers = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        int maxnum = 0;
        int maxi = 0 , maxj = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (numbers[i][j] > maxnum) {
                    maxnum = numbers[i][j];
                    maxi = i;
                    maxj = j;
                }
            }
        }

        System.out.println(maxnum);
        System.out.println((maxi + 1) + " " + (maxj + 1));

    }
}