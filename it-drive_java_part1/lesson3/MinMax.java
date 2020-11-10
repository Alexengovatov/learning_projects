import java.util.Scanner;

class MinMax{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int [] a = new int[length];
		for (int i = 0; i < a.length; i++)
			a[i] = scanner.nextInt();

		int max = a[0];
		int min = a[0];
		int indexOfMin = 0;
		int indexOfMax = 0;
		
		for (int i = 0; i < a.length; i++){
			
			if (a[i] > max) { 
				max = a[i];
				indexOfMax = i;
			}
			if (a[i] < min) {
				min = a[i];
				indexOfMin = i;
			}

		}

		int temp = a[indexOfMin];
		a[indexOfMin] = a[indexOfMax];
		a[indexOfMax] = temp;	
		
		for (int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}	
	}
}