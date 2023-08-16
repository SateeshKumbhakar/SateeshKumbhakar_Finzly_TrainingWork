package oopsCodding.InheritanceAndPoly;

public class Zoo {
  
	{
		System.out.println("**Welcome To Zoo**");
		
	}
	
	
	public static void main(String[] args) {
	
		Animal animal = new Animal("animal",0);
		
		Elephant elephant = new Elephant("Appu", 100);
		Lion lion=  new Lion("Lion", 50);
		Giraffe  giraffe =  new Giraffe("Giraffe", 40);
		
		animal.makeSound();
		elephant.makeSound();
		lion.makeSound();
		giraffe.makeSound();
	}
	
}
