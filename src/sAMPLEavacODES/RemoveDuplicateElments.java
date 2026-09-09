package sAMPLEavacODES;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElments {
	
	public static void main(String[] args) {
		
		int a[] = {12,23,12,23,24,54,32};
		
		
		Set<Integer> s = new LinkedHashSet<>();
		
		
		for(int x:a) {
			
			s.add(x);
	
		}
		
		System.out.println(s);
		
		
		
		
		
		
		
	}

}
 