package day_7;

import java.util.Scanner;

public class Gambling {
	public static void main(String[] args) {

		Scanner u = new Scanner(System.in);
		System.out.println("Enter $Stake value: ");
		int $Stake = u.nextInt();
		System.out.println("Enter $Goal value: ");
		int $Goal = u.nextInt();
		System.out.println("Enter number of times: ");
		int noOfTimes = u.nextInt();

		int bets = 0;
		int wins = 0;

		for (int i = 0; i < noOfTimes; i++) {
			int cash = $Stake;

			while (cash > 0 && cash < $Goal) {
				bets++;

				if (Math.random() < 0.5)
					cash++; // win $1
				else
					cash--; // lose $1
			}
			if (cash == $Goal)
				wins++;
		}

		// print results
		System.out.println();
		System.out.println(wins + " wins of " + noOfTimes);
		System.out.println("Percent of games won = " + 100.0 * wins / noOfTimes);
		System.out.println("Avg # bets           = " + 1.0 * bets / noOfTimes);
	}

}
