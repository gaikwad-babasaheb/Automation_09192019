package exceptionalhandling;

public class exceptinalhandling1 {

	public static void main(String[] args) 
	{
		
		

		String[] str=new String[3];
		
		str[0]="Aish";
		str[1]="Tambe";
		str[2]="Techbodhi";
		try {
		//ArrayIndexOutOfBoundsException
		System.out.println(str[3]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
        System.out.println(e.getMessage());
		}
	}

}
