package ru.alexengovatov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int number = scanner.nextInt();
	int result = 0;
	result = mirrorOfnumber(number);
        System.out.println(result);// write your code here
    }

    public static int mirrorOfnumber(int number){
        int result = 0;
        while (number > 0){
            result = (number % 10) + result * 10;
            number /= 10;
        }
        return result;
    }
}
