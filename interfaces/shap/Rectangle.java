package oopsCodding.interfaces.shap;

public class Rectangle implements Shape {

    double length,width;
    
    
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		
		return length* width;
	}

	@Override
	public double calculatePerimeter() {
		
		return 2*(length+width);
	}

}
