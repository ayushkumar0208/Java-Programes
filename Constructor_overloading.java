package Obeject_Oriented_Programming;

public class Constructor_overloading {

	public static void main(String[] args) {
		vehicle car2 = new vehicle(4,"blue");
		vehicle car = new vehicle(4);
		System.out.println(car.wheels);
		System.out.println(car2.color);
		System.out.println(car2.wheels);
//		 Similarly as we learn in method overloading , if two or more constructors are defined with different parameters then it is known as constructors overloading.
//		class veg{
//			veg(){
//		
//			}
//		 
//			veg(int a){
//		 
//		  }
//		}

	}

}
class vehicle {
	int wheels;
	String color;
	vehicle(int noofwheels){
		wheels=noofwheels;
	}
	vehicle(int noofwheels ,String newcolor){
		color=newcolor;
		wheels=noofwheels;
	}
}