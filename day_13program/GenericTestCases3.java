package day_13program;

public class GenericTestCases3 {
	public static <T> void toPrint(T[] inputArray) {
		for (T element : inputArray) {
			System.out.print(element);
		}
		System.out.println();

	}

	private Object getMaximum;

	public void getMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
		Integer maxNumber = firstNumber;
		if (secondNumber.compareTo(maxNumber) > 0) {
			maxNumber = secondNumber;
		}
		if (thirdNumber.compareTo(maxNumber) > 0) {
			maxNumber = thirdNumber;
		}
		System.out.println(maxNumber);
	}

	public void getMaximum(Float firstNumber, Float secondNumber, Float thirdNumber) {
		Float maxNumber = firstNumber;
		if (secondNumber.compareTo(maxNumber) > 0) {
			maxNumber = secondNumber;
		}
		if (thirdNumber.compareTo(maxNumber) > 0) {
			maxNumber = thirdNumber;
		}
		System.out.println(maxNumber);
	}

	private void getMaximum(String s1, String s2, String s3) {
		if (s1.length() >= s2.length() && s1.length() >= s3.length()) {
			System.out.println(s1);

		} else if (s2.length() >= s1.length() && s2.length() >= s3.length()) {
			System.out.println(s2);

		} else {
			System.out.println(s3);

		}
	}

	public static void main(String[] args) {

		GenericTestCases3 generictest = new GenericTestCases3();
		generictest.getMaximum(2.9F, 3.4F, 6.9F);
		generictest.getMaximum(100, 200, 3000);
		generictest.getMaximum("Apple", "peach", "Banana");

	}
}
