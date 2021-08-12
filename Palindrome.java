package assignment;

public class Palindrome {

	public static void main(String[] args) {
		
		String str = "madam";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String rev = sb.toString();
		if (str.equals(rev)) {
			System.out.println("The value is palindrome");
		} else {
			System.out.println("The value is not palindrome");
		}

	}
}
