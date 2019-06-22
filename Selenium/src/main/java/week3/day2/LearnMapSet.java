package week3.day2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMapSet {
	
	public static void main(String[] args) {
		
		// check repeated char and print how many times repeated in map
		
		
		String name = "Chennai";
		
		char[] charArray = name.toCharArray();
		
		// System.out.println("seperated chars from word "+charArray );
		
		Map<Character,Integer> nameMap = new HashMap<>();
		
		
		for (char ch : charArray) {
			
			if(nameMap.containsKey(ch))
			{
			nameMap.put(ch, nameMap.get(ch)+1);	
				
				
			}
			else
			{
				nameMap.put(ch,	1); 
			}
			
					
	
							
			
		}
		System.out.println(nameMap);
		
		
		
		
		
		
	}
	
	

}
