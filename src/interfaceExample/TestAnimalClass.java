package interfaceExample;

public class TestAnimalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog myDog=new Dog();
		
		myDog.eat();
		myDog.fly();
		myDog.move();
		
		System.out.println(myDog.outerCovering);
		System.out.println(myDog.numberOfLegs);
		
		System.out.println("============================");
		System.out.println(Bird.outerCovering);
		System.out.println(Bird.numberOfLegs);

	}

}
