package classwork.programs;

public class FirstCharCapsLearn {

	public static void main(String[] args) {


String str1= "welcome to java";

 char[] chars = str1.toCharArray();
chars[0]=Character.toUpperCase(chars[0]);

for (int i=1; i<chars.length;i++)
{
if (chars[i-1]==' ')
chars[i]=Character.toUpperCase(chars[i]);
}
System.out.println(chars);
		
		
		
	}

}
