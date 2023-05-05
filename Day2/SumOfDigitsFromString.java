package Week1.Day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		int sum = 0;
		String a = "Test12leaf349";
		for (int i = 0; i< a.length(); i++) {
			if (Character.isDigit(a.charAt(i))) {
				sum++;
			}
		}
		System.out.println("Number of digits in the string "+a+ " is "+sum);
	}


	}

