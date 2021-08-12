package assignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String a1 = "aruldoss";
		StringBuffer s = new StringBuffer();
		char[] value = a1.toCharArray();
		for (int i = 0; i < value.length; i++) {
			char a = value[i];
			if (i % 2 != 0) {
				a = Character.toUpperCase(a);
			}
			s.append(a);
		}
		System.out.println("The modified string is : " + s.toString());

	}
}
