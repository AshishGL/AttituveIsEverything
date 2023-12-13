package OOPSConcepts;

 abstract class AbstractClassExample {
	
	
	int number;
	
	abstract int draw();
	public abstract String toString();
	
	//constructor
	
	public AbstractClassExample(int number) {
		
		System.out.println("Constructor Calling.....");
		this.number=number;
		
	}

}
