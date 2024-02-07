import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int[] chess = {1, 1, 2, 2, 2, 8};

        Scanner sc = new Scanner(System.in);

        int[] chessUse = new int[6];

        for (int i = 0; i < chessUse.length; i++) {
            chessUse[i] = sc.nextInt();

            if(chessUse[i] != chess[i]) {
                System.out.print(chess[i] - chessUse[i] + " ");
            } else {
                System.out.print("0 ");
            }
        }

    }
}