package day_6_logical_program;

import java.util.Scanner;

public class PerfectNumber {
	public static Scanner sc;

	public static void main(String[] args) {

		int i, number, sum = 0;

		sc = new Scanner(System.in);

		System.out.println("Enter your prefct number:");

		number = sc.nextInt();

		for (i = 1; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == number) {
			System.out.println(" Perfect Number" + " " + number);

		} else {
			System.out.format(" NOT a Perfect Number" + " " + number);
		}
	}

}
