package oopsCodding.interfaces.shap;

public class Main {
	
	public static void main(String[] args) {
		Shape shape = new Circle(3);
		System.out.println("Get Circle Area And Parameter");
		System.out.println(shape.calculateArea());
		System.out.println(shape.calculatePerimeter());
		
		
		shape = new Rectangle(1,2);
		System.out.println("Get Rectangle Area And Parameter");
		System.out.println(shape.calculateArea());
		System.out.println(shape.calculatePerimeter());
		
		shape = new Triangle(1,2,3);
		System.out.println("Get Triangle Area And Parameter");
		System.out.println(shape.calculateArea());
		System.out.println(shape.calculatePerimeter());
	}

}
