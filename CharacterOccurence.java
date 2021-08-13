package assignment;



public class CharacterOccurence {

	public static void main(String[] args) {
	String str="arull";

	char[] strArray=str.toCharArray();
	for (int i = 0; i < strArray.length; i++) {
		int count=1;
		for(int j=i+1;j<strArray.length;j++) {
			if(strArray[i]==strArray[j]) {
				count++;
			strArray[j]='0';
			}
			
		}
		if(strArray[i]!='0') {
			System.out.println(strArray[i]+":"+count);
		}
		
	}
	}
}

	


