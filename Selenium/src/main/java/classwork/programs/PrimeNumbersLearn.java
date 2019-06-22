package classwork.programs;

public class PrimeNumbersLearn {

	public static void main(String[] args) {

		int num=0;

		for (int i=2;i<=100;i++)
		{
			for (int j=2;j<i-1;j++)
			{
				if(i%j==0)
				num=num+i;
				
			}
			if(num==0)
			System.out.println("Prime numbers from 1 to 100 are "+i);
			else
			num=0;
			
		}






	}

}
