import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        ArrayList<String> numbers = new ArrayList<>();

        for (int i = m; i <= n; i++) {
            numbers.add(numberToString(i));
        }

        Collections.sort(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(stringToNumber(numbers.get(i)));
            if (i != 0 && i % 10 == 9) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }

    public static String numberToString(int number) {
        Map<Integer, String> strMap = new HashMap<>();
        strMap.put(0, "zero");
        strMap.put(1, "one");
        strMap.put(2, "two");
        strMap.put(3, "three");
        strMap.put(4, "four");
        strMap.put(5, "five");
        strMap.put(6, "six");
        strMap.put(7, "seven");
        strMap.put(8, "eight");
        strMap.put(9, "nine");

        StringBuilder result = new StringBuilder();
        String num = String.valueOf(number);
        for (int i = 0; i < num.length(); i++) {
            int digit = Character.getNumericValue(num.charAt(i));
            result.append(strMap.get(digit)).append(" ");
        }
        return result.toString().trim();
    }

    public static int stringToNumber(String number) {
        Map<String, Integer> intMap = new HashMap<>();
        intMap.put("zero", 0);
        intMap.put("one", 1);
        intMap.put("two", 2);
        intMap.put("three", 3);
        intMap.put("four", 4);
        intMap.put("five", 5);
        intMap.put("six", 6);
        intMap.put("seven", 7);
        intMap.put("eight", 8);
        intMap.put("nine", 9);

        String[] numbers = number.split(" ");
        int result = 0;
        for (String num : numbers) {
            result = result * 10 + intMap.get(num);
        }
        return result;
    }
}
