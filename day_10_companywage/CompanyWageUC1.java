package day_10_companywage;

import java.util.Scanner;

public class CompanyWageUC1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Employee Wage Computation");
		int randomCheck = (int) (Math.random() * 3);

		if (randomCheck == 0) {
			System.out.println("Employee is absent");
		} else if (randomCheck == 1) {
			System.out.println("Employee is present");
		}
	}
}
