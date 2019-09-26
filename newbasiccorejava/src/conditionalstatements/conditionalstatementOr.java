package conditionalstatements;

public class conditionalstatementOr {

	public static void main(String[] args) {
		int pcm=50;
		int jre=40;
		int cet=50;
		
		if(pcm>=50)
		{
			if(jre>=40 || cet>=50) 
			{
				System.out.println("you are eligible");
			
		}else {
			System.out.println("you are not eligible");
		}
		}else {
			System.out.println("you are not eligible");
			
		}


	}

}
