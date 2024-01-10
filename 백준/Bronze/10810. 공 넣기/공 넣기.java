import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int rst[] = new int[n];
        int input[][] = new int[m][3];

        for(int i=0; i < m; i++) {
            for(int j = 0; j < 3; j++) {
                input[i][j] = sc.nextInt();
            }
            for(int k = input[i][0]-1; k <= input[i][1]-1; k++){
                rst[k] = input[i][2];
            }
        }
        for(int i = 0; i< rst.length; i++) {
            System.out.print(rst[i] + " ");
        }
    }
}
