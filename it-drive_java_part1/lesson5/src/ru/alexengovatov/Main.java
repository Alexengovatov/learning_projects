package ru.alexengovatov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double a = scanner.nextDouble();
	double b = scanner.nextDouble();
	int n = scanner.nextInt();
		System.out.println(Rectaingle(a, b, n));
		System.out.println(Simpson(a, b, n));
	// write your code here
    }

    public static double Rectaingle(double a, double b, int n){
		double h = (b - a) / n;

		double result = 0;

		for (double i = a; i <= b; i = i + h){
			result = f(i)*h + result;
		}
		return result;
	}

    public static double f(double x){
        return x*x;
    }

    public static double Simpson(double a, double b, int n){
    	double h = (b - a) / n;
    	double result = 0;

    	for (double i = a + h; i <= b; i = i + 2 * h){
    		result = result + f(i - h) + 4 * f(i) + f(i + h);
		}
    	result = result * h / 3;
    	return result;
	}
}
