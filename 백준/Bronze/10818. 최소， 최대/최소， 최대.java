import java.util.Scanner;
public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] b = new int[a];
		for(int i = 0; i < a; ++i) {
			b[i] = sc.nextInt();
		}
		int min = b[0];
		int max = b[0];
		for(int j = 1 ; j < a; ++j) {
			if(min>b[j])
			{
				min=b[j];
			}
			if(max<b[j])
			{
				max=b[j];
			}
		}
		System.out.print(min +" "+ max);
		sc.close();
	}
}