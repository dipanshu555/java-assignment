package day_13program;

public class GenericTestCases2 {
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
		System.out.println("maximum integer value is: " + maxNumber);
	}

	public void getMaximum(Float firstNumber, Float secondNumber, Float thirdNumber) {
		Float maxNumber = firstNumber;
		if (secondNumber.compareTo(maxNumber) > 0) {
			maxNumber = secondNumber;
		}
		if (thirdNumber.compareTo(maxNumber) > 0) {
			maxNumber = thirdNumber;
		}
		System.out.println("Maximum float value is :" + maxNumber);
	}

	public static void main(String[] args) {
		GenericTestCases2 geneicTest = new GenericTestCases2();
		geneicTest.getMaximum(23.5F, 235.5F, 234.333F);
		geneicTest.getMaximum(100, 200, 3000);

	}
}
