package day_6_logical_program;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = scanner.nextInt();
		int reverse = 0;

//		for (int i = 0; i < number; ++i) {
//			int rem = number % 10;
//			reverse = reverse * 10 + rem;
//			number = number / 10;
//		}
//		System.out.println(reverse);

		while (number > 0) {
			int reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
		}
		System.out.println(reverse);

	}

}
