package assignment;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 4 };
		int m;

		int sum1 = 0;
		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];

		}
		System.out.println("The sum of the array value is : "+ sum1);
		int sum2 = 0;

		for (int i = 1; i <= 4; i++) {
			sum2 = sum2 + i;

		}
		System.out.println("The sum of the complete value is : "+ sum2);
		System.out.println("The Missing number is : "+ (sum2-sum1));
	}

}
