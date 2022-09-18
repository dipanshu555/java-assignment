package day_13program;

import java.util.Scanner;

public class GenericTestCases1 {
	public static void main(String[] args) {
		GenericTestCases1 generic = new GenericTestCases1();
		generic.Integer();

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

	public void Integer() {
		Integer num1, num2, num3;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Num1");
		num1 = in.nextInt();
		System.out.println("Enter Num2");
		num2 = in.nextInt();
		System.out.println("Enter Num3");
		num3 = in.nextInt();
		solve(num1, num2, num3);
	}
}
