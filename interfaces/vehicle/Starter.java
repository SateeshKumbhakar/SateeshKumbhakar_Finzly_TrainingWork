package oopsCodding.interfaces.vehicle;

public class Starter {
	
	public static void main(String[] args) {
		Vehicle car = new Car(10);
		Vehicle motercycle = new Motercycle(5);
		
	    
		Vehicle[] vehicle = {car,motercycle};
	    
		for(Vehicle v: vehicle) {
	    	v.start();
	    	v.accelerate();
	    	v.brake();
	    	System.out.println();
	    }
		
	}

}
