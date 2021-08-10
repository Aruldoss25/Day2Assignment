package assignment;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, 3, 6, 7, 9 };
		int b[] = { 4, 6, 8, 9, 12 };
//Method 1
		int i = 0, j = 0;

		// 2 0

		while (i < a.length && j < b.length) {
			if (a[i] == b[j]) {
				System.out.println("The value is :" + a[i]);
				i++;
				j++;

			} else if (a[i] > b[j]) {
				j++;

			} else {
				i++;
			}

		}
//Method 2
		for (int k = 0; k < a.length; k++) {
			for (int m = 0; m < b.length; m++) {
				if (a[k] == b[m]) {
					System.out.println("The interfsection of the array is " + a[k]);
				}
			}

		}

	}

}
