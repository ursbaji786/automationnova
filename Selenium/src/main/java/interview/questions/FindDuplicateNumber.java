package interview.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumber {

	int num[] = {1,4,5,3,3,7,8,7,9};
	
	
	
	

	public void solution1()
	{

		

		for (int i = 0; i < num.length; i++) {

			for (int j = i+1; j < num.length; j++) {

				if (num[i] == num[j])	
				{
					System.out.println("duplicate is "+num[i]);
					break;
				}

			}

		}

	}
	
	
	public void solution2()
	{
		
		Arrays.sort(num);
		for (int i = 0; i < num.length-1; i++) {
			
			if(num[i] == num[i+1])
				System.out.println("duplicate is "+num[i]);
			
		}
		
		
	}
	
	public void solution3()
	{
		
		Set<Integer> name1 = new HashSet<>();
		for (int i = 0; i < num.length-1; i++) {
			
			boolean add = name1.add(num[i]);
			if (add == false)
				System.out.println("duplicate is "+num[i]);
				
			
		}
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {

		FindDuplicateNumber obj = new FindDuplicateNumber();
		obj.solution1();
		obj.solution2();
		obj.solution3();
	}



}
