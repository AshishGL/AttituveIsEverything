package encapsulation;

public class Bird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myAnimal=new Animal();
		
        myAnimal.setAge(10);
        myAnimal.setName("Eagle");
        
        System.out.println(myAnimal.getName());
        System.out.println(myAnimal.getAge());
}

}
