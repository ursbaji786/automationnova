package week1.day2;

public class Plaindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// check given word is plaindrome 

		String name1  = "ammA";
		String reverse1 = "";
// reverse string
		
		int length1 = name1.length();
		
		//System.out.println(length1);
		
		char[] charArray = name1.toCharArray();
		
		for (int i = charArray.length-1; i >=0; i--) {
			//System.out.print(charArray[i]);
			
			reverse1 = reverse1+charArray[i];

		}		
		
		//System.out.print(reverse1);
		
		if (name1.equalsIgnoreCase(reverse1))
		{
			System.out.println("given word is palindrome");
		}
		
		else
		{
			System.out.println("not plaindrome");
		}
		



	}

}
