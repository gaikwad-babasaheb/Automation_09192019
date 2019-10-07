package exceptionalhandling;

import functions.Accessmodifiers;

public class excptiontype1 {
	static Accessmodifiers acc;
	
	

	public static void main(String[] args) {
		
		String[] str=new String[3];
		
		str[0]="Aish";
		str[1]="Tambe";
		str[2]="Techbodhi";
		System.out.println(str[3]);
		//ArrayIndexOutOfBoundsException
		//System.out.println(str[3]);
		
		
		String add="aish";
		System.out.println(add.charAt(5));
	}
		


}
