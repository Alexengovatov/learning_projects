import java.util.Scanner;

class mirror{
	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);
		int ish = scanner.nextInt();
		int kon;
		
		kon = 0;
		while (ish > 0){
			kon = (ish % 10) + kon * 10;
			ish /= 10; 	
		}
		System.out.println(kon);
	}
}