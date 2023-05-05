package Week1.Day2;
import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 7, 6, 8 };

		Arrays.sort(array);

		for (int i = 1; i <= array.length - 1; i++) {
			if (i != array[i - 1]) {
				System.out.println("Missing Element is " + i);
				break;
			}

		}
	}


	}

