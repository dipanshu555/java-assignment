package day_10_companywage;

import java.util.Scanner;

public class CompanyWageUC3 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("welcome to Employee Computation");
		int randomCheck = (int) (Math.random() * 3);
		int wage_Per_Hours = 20;
		int full_Day_Hours = 8;
		int total_Wage = 0;

		if (randomCheck == 0) {
			System.out.println("Employee is absent");
		} else {
			total_Wage = wage_Per_Hours * full_Day_Hours;
			System.out.println("EMployee is present");
			System.out.println(total_Wage);

		}
	}
}
