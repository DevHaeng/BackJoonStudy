import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String cardNum = br.readLine();
            System.out.println(isValidCard(cardNum) ? "T" : "F");
        }
    }

    public static boolean isValidCard(String cardNum) {
        int sum = 0;
        boolean isEven = false;

        for (int i = cardNum.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(cardNum.charAt(i));

            if (isEven) {
                digit *= 2;
                if (digit > 9) {
                    digit = digit / 10 + digit % 10;
                }
            }

            sum += digit;
            isEven = !isEven;
        }

        return sum % 10 == 0;
    }
}