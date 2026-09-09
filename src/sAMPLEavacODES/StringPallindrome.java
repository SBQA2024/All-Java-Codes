package sAMPLEavacODES;

public class StringPallindrome {
	public static void main(String[] args) {
		
		
		String s ="ghnugf";
		String revstr="";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			revstr= revstr + s.charAt(i);
			
			
		}
		
		System.out.println(revstr);
	
		
		if(s.equalsIgnoreCase(revstr)) {
			
			System.out.println("pallindrome");
		}else {
			
			System.out.println("Not Pallindrome");
		}
		
	}

}
