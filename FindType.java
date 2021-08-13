package assignment;

public class FindType {
	
	


	public static void main(String[] args) {
	      String str = "$ hi helo 123";
	      
	      char[] a=str.toCharArray();
	      for(int i=0; i < str.length(); i++) {
	       //Boolean flag = Character.isDigit(str.charAt(i));
	         if(Character.isDigit(a[i])) {
	            System.out.println("'"+ a[i]+"' is a number");
	         }
	         else if(Character.isLetter(a[i])){
	        	 System.out.println("'"+ a[i]+"' is a letter");
	         }
	         else if(Character.isSpaceChar(a[i])) {
	        	 System.out.println("'"+a[i]+"' is a space");
	         }
	         else {
	        	 System.out.println("'"+a[i]+"' is a Special character");
	         }
	         
	      }
	}
}
		



