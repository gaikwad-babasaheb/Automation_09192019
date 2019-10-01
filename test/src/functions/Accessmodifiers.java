package functions;

public class Accessmodifiers {
	public static void main(String[] args) {
		Accessmodifiers obj= new Accessmodifiers();
		obj.publicFunction();
		obj.privateFuntion();
		obj.noAcessmodfunction();
		obj.protectedfunction();
	}

	public void publicFunction(){
	
		System.out.println("public function");
	}
	private void privateFuntion() {
		System.out.println("private funtion");
	}
	
	void noAcessmodfunction() {
		System.out.println("no acess mod.function");
	}
	
	protected void protectedfunction() {
		System.out.println("protected function");
	}
	
}
