package Week1.Day2;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String input="madam";
		String input2="";
		
		for (int i=input.length()-1;i>=0;i--)
			
			input2=input2+input.charAt(i);
		System.out.print(input2);
		if(input.equals(input2))
			System.out.println("This is palindrome");
		else 
			System.out.println("Not palindrome");
		
		
	}
			
		


	}


