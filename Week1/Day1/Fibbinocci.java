package Week1.Day1;

public class Fibbinocci {

	public static void main(String[] args) {

		int range = 11;
		int firstNumber = 0;
		int secNumber = 1;
		System.out.println("Fibonacci series");
		for (int i = 1; i <= range; i++) {
			int thirdNumber = firstNumber + secNumber;
			firstNumber = secNumber;
			secNumber = thirdNumber;
			System.out.println(thirdNumber);
		}
	}

	}


