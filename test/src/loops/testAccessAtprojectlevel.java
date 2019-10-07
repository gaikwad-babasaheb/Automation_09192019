package loops;

import functions.Accessmodifiers;

public class testAccessAtprojectlevel extends Accessmodifiers {

	public static void main(String[] args) {
		
		Accessmodifiers obj= new Accessmodifiers();
		obj.publicFunction();
		
		testAccessAtprojectlevel obj2= new testAccessAtprojectlevel ();
		obj2.publicFunction();
	}

}
