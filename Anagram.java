package assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
String str1="butter";//berutt
String str2="utterb";//certtu
if(str1.length()==str2.length()) {
	char[] arrStr1=str1.toCharArray();
	char[] arrStr2=str2.toCharArray();
	Arrays.sort(arrStr1);
	Arrays.sort(arrStr2);
	//0
	
	for(int i=0;i<=arrStr1.length;) {
		if(arrStr1[i]==arrStr2[i]) {
			System.out.println("the number is anagram");
			
		}
		else
			System.out.println("The value is not a  anagram");
		break;
	}
}
else
	System.err.println("the number will not be a anagram");
	}

}
