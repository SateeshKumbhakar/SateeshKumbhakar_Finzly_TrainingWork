package oopsCodding.overloadingAndOverriding;

import java.util.Date;

public class Room {
   
	private int roomNumber;
	private static int  capacity =0;
	private int pricePerNight;
	
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public int getPricePerNight() {
		return pricePerNight;
	}
	
	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	
	@Override
	public String toString() {
		return "Room [roomNumber= "  + roomNumber +", pricePerNight= " + pricePerNight + " ";
	}
	
	public Room( int roomNumber,int pricePerNight) {
		super();
		this.roomNumber = roomNumber;
		 capacity-=1;
		this.pricePerNight = pricePerNight;
	}
	
	public void reservation() {
		System.out.println("Room is booked without check-in and check-out dates");
	}
	
	
	public void reservation(Date checkIn ,Date checkOut) {
		System.out.println("Your is done with check-in and check-out dates.....");
	}
	
	
	public static boolean isAvailable() {
		if(capacity > 0) return true;
		else return false;
	}
	

}
