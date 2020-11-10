import java.util.Scanner;

class ReversingArray{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int array [] = new int[length];
		for (int i = 0; i < array.length; i++){
			array[i] = scanner.nextInt();
		}
		for (int i = 0; i < array.length / 2; i++){
			int temp = array[i];
			array[i] = array[length - 1 - i];
			array[length - 1 - i] = temp;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}