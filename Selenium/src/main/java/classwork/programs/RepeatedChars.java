package classwork.programs;

public class RepeatedChars {

	public static void main(String[] args) {

		String name = "bajib";

		int temp=0;
		int count=0;
		int repeated = 0;

		char[] charArray = name.toCharArray();

		for (int i=0; i<name.length();i++)
		{
			char ch = name.charAt(i);

			for (int j=i+1;j<name.length();j++)
			{
				char ch1 = name.charAt(j);

				if (ch==ch1)
					count=count+1;
				if (count>temp)
				{
					temp=count;
					repeated =i;
				}

			}
		}
		System.out.println(charArray[repeated]);


	}

}
