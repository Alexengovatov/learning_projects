package ru.alexengovatov;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = sumOfDigits(number);
        System.out.println(result);

    }
    public static int sumOfDigits(int number) {
        int result = 0;
        while (number > 0) {
            result += number % 10;
            number /= 10;
        }
        return result;// write your code here
    }
}
