package oopsCodding.interfaces.vehicle;

public class Motercycle implements Vehicle {
    int speed,maxSpeed=140;
	
    public Motercycle(int speed) {
//		super();
		this.speed = speed;
		
	}

    

	@Override
	public void start() {

		System.out.println("Motercycle is started at speed "+speed); 
	}

	@Override
	public void accelerate() {
		if(this.speed<= maxSpeed) {
			this.speed=this.speed+10;
		System.out.println("Motercycle is accelerated & speed  "+this.speed); 
		}
		else
			System.out.println("Motercycle is at high speed"); 
	}

	@Override
	public void brake() {
		this.speed = 0;
		System.out.println("Motercycle is stopped.");
	}

}
