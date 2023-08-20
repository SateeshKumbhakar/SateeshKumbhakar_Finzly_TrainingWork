package oopsCodding.interfaces.vehicle;

public class Car implements Vehicle {

	int speed,maxSpeed =150;
	
	public Car(int speed) {
		super();
		this.speed = speed;
	}

	@Override
	public void start() {

		System.out.println("Car is started at speed "+speed); 
	}

	@Override
	public void accelerate() {
		if(this.speed<= maxSpeed) {
		this.speed=this.speed+10;
		
		System.out.println("Car is accelerated & speed  "+this.speed); 
		}
		else
		  System.out.println("Car is at high speed"); 
	}

	@Override
	public void brake() {
		this.speed = 0;
		System.out.println("Car is stopped.");

	}

}
