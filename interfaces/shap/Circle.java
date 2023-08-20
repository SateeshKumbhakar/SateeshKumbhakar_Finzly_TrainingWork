package oopsCodding.interfaces.shap;


public class Circle implements Shape {

	final double PI = 3.14;
	double r;
	Circle(double r){
		this.r = r;
	}
	
	@Override
	public double calculateArea() {	
    
		return ( PI*r*r);
	}

	@Override
	public double calculatePerimeter() {
		return ( 2* PI*r);

	}

}
