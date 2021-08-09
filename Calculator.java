package assignment;

public class Calculator {

	int s1 = 5, s2 = 6, s3;
	double d1 = 75, d2 = 56, d3;
	Float f1 = 3.5f, f2 = 5.2f, f3;
	String intro="Welcome to calculator";

	public void addition() {
		s3 = s1 + s2;
		System.out.println("The sum of the value is: " + s3);
	}

	public void Subtraction() {
		s3 = s2 - s1;
		System.out.println("The subtraction of the value is: " + s3);
	}

	public void multiplication() {
		d3 = d1 * d2;
		System.out.println("The multiplication of the value is :" + d3);
	}

	public void division() {
		f3 = f1 / f2;
		System.out.println("The division of the value is : " + f3);
	
	}
	
	public String info() {
				return intro;
	}

}
