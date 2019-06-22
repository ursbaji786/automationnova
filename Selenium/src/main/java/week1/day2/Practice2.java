package week1.day2;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// replace spaces in the given string

		String comapanyName  = "equiniti india private limited";
		
		int totalCount = comapanyName.length();
		
		System.out.println(totalCount);
		
		String replacedName = comapanyName.replace(" ", "");
		
		System.out.println(replacedName);
		
		// count first char values
		
		char[] charArray = comapanyName.toCharArray();
		
		int j=0;
		
		for (int i = 0; i < charArray.length; i++) {
			//System.out.println(charArray[i]);
			if (charArray[i] == charArray[0])
			{
				j++;
			}
			
		}
System.out.println(j);
		


	}
}
