package day_13program;

import java.util.Scanner;

public class GenericProgramForChecking {
	public static void main(String[] args) {
		Integer num1, num2, num3;
		Float num4, num5, num6;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Num1");
		num1 = in.nextInt();
		System.out.println("Enter Num2");
		num2 = in.nextInt();
		System.out.println("Enter Num3");
		num3 = in.nextInt();

		System.out.println("*************************8");

		num4 = in.nextFloat();
		num5 = in.nextFloat();
		num6 = in.nextFloat();
		solve(num1, num2, num3);
		solve(num4, num5, num6);
	}

	public static <T extends Comparable<T>> void solve(T num1, T num2, T num3) {
		T maxNum = num1;
		if (num2.compareTo(maxNum) > 0) {
			maxNum = num2;
		}
		if (num3.compareTo(maxNum) > 0) {
			maxNum = num3;
		}
		System.out.println("maximun Number is :" + maxNum);

	}

	public static <T extends Comparable<T>> void solve1(T num1, T num2, T num3) {
		T maxNum = num1;
		if (num2.compareTo(maxNum) > 0) {
			maxNum = num2;
		}
		if (num3.compareTo(maxNum) > 0) {
			maxNum = num3;
		}
		System.out.println("maximun Number is :" + maxNum);
	}
}
