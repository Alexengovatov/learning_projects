import java.util.Scanner;

class BinaryDigits{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		long result = 0;
		while (a > 0) {
			result = result * 10 + (a % 2);
			a /= 2;
		}
		System.out.println(result);
	}
}