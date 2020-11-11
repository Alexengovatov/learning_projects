package ru.alexengovatov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int a, b, result;
	a = scanner.nextInt();
	b = scanner.nextInt();
	result = sumOfRange(a, b);
        System.out.println(result);// write your code here
    }
    public static int sumOfRange(int a, int b){
        int result = 0;
        for (int i = a; i <= b; i++){
            result += i;
        }
        return result;
    }
}
