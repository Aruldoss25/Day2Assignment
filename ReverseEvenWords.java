package assignment;

public class ReverseEvenWords {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String str = "hi hello how are you";

		String[] words = str.split(" ");

		for (int i = 0; i < words[i].length(); i++) {

			if (i % 2 == 0) {
				int lenOfOddIndexWords= words[i].length();
				for (int j = words.length; j >= 0; j--) {
					System.out.println(words[i].charAt(j));
				}

				System.out.println(" ");
			} else {
				System.out.println(words[i] + " ");
			}
		}

	}
}
