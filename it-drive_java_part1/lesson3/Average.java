import java.util.Scanner;

class Average{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int [] a = new int [length];
		double average;
		int sum = 0;
		for (int i = 0; i < a.length; i++){
			a[i] = scanner.nextInt();
			sum += a[i];
		}
		average = sum * 1.0 / length ;
		System.out.println(average);

	}
}