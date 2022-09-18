package day16_17;

import java.util.Scanner;

public class FindYourNum {
	int[] numberArray; // array of numbers of given range
	int count = 0;
	int ans; // the number in mind
	int N; // range
	double maxCount = 0; // number of times question will be asked
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		FindYourNum findYourNumber = new FindYourNum();
		findYourNumber.start();
	}

	void start() {
		System.out.print("Enter limit N: ");
		N = sc.nextInt();
		numberArray = new int[N]; // array initialization
		// fills the array
		for (int i = 0; i < N; i++) {
			numberArray[i] = i;
		}
		// calculates maximum count of questions
		maxCount = (Math.log(N) / Math.log(2));
		System.out.println("Number of tries required to guess: " + ((int) maxCount + 1));
		binarySearch(0, N - 1);
	}

	void binarySearch(int first, int last) {
		if (count < maxCount) {
			int middle = (first + last) / 2;
			count++;
			System.out.println("Is number between " + first + " and " + middle + "?");
			String temp = sc.next();
			if (temp.equals("y")) {
				change(middle + 1, last);
				binarySearch(first, middle);
			} else if (temp.equals("n")) {
				change(first, middle);
				binarySearch(middle + 1, last);
			}
		} else {
			for (int i : numberArray) {
				if (i != -1) {
					System.out.println("The number is: " + i);
				}
			}
		}
	}

	/**
	 * replaces all the integer in the array to -1 as the number is not in this
	 * range first - first element in the range last - last element in the range
	 */
	void change(int first, int last) {
		for (int i = first; i <= last; i++) {
			numberArray[i] = -1;
		}
	}
}
