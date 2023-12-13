package interfaceExample;

public class Dog implements Animal,Bird {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Cannot Flying");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Walk and Run");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Bones and Biscuits");
		
	}

}
