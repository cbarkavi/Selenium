package Week1.Day1;

public class IsPrime {

	public static void main(String[] args) {
		int Num = 17;
		boolean status = false;
		for (int i = 2; i <= Num / 2; i++) {
			int rem = Num % i;
			while (rem == 0) {
				status = true;
				break;
			}
		}

		if (status == true) {
			System.out.println("Given number is not a prime number");
		} else
			System.out.println("Given number is a prime number");

	}
}

