import java.util.Scanner;

class Multiply{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		long a = 1;
		int digit = scanner.nextInt();
		while (digit != -1) { 
			if (isEven(digit)){
				a *= digit;
			}
			digit = scanner.nextInt();
		}

		System.out.println(a);

	}

	public static boolean isEven(int a){
		int sum = 0;
		while (a > 0){
			sum += (a % 10);
			a /= 10;
		}
		if (sum % 2 == 0) return true;
		else return false;
	}
}