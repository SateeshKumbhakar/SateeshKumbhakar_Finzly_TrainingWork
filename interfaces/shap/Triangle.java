package oopsCodding.interfaces.shap;

public class Triangle implements Shape {

	double a,b,c;
//	double s = (a+b+c)/2;
	 
	
	public Triangle(double a, double b, double c) {
//		super();
		this.a = a;
		this.b = b;
		this.c = c;
		 
	}
	double s = (this.a+this.b+this.c)/2;
	
	

	@Override
	public double calculateArea() {
		double s = this.calculatePerimeter()/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

	@Override
	public double calculatePerimeter() {
		
		return a+b+c;
	}

}
