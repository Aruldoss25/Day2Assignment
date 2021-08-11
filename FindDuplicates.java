package assignment;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 6, 7, 8, 2, 3 };

		System.out.println("The Duplicates in the array is: ");
		
		//1 1

		for (int i = 0; i < a.length; i++) {
			for (int j=i+1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
				}
			}
		}

	}

}
