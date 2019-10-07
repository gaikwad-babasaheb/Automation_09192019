package exceptionalhandling;

import functions.Accessmodifiers;

public class multipleTrycatchBlock {
	static Accessmodifiers acc;

	public static void main(String[] args) {
		
		try {
		
      String[] str=new String[3];
		
		str[0]="Aish";
		str[1]="Tambe";
		str[2]="Techbodhi";
		System.out.println(str[3]);
		//ArrayIndexOutOfBoundsException
		System.out.println(str[3]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
	        System.out.println(e.getMessage());
			}finally {
				System.out.println("Finally block");
				System.out.println("Closing of data base connection");
				System.out.println("end report");
				System.out.println("clear catch");
			}
		
	}

}
