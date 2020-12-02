package Obeject_Oriented_Programming;

public class Parameterized_constructor {
	public static void main(String[] args) {
		transport car = new transport(4);
		transport scooty = new transport(2);
		System.out.println(car.wheels);
		System.out.println(scooty.wheels);
	}
}
class transport {
	int wheels;
	transport(int noofwheels){
		wheels=noofwheels;
	}
}
 