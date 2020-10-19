package Obeject_Oriented_Programming;

class laptop{
	boolean windows;
	boolean mac;
	boolean gaming;
	public void description() {
		System.out.println("In working condition");
	}
}
class dog{
	int legs;
	int eyes;
	public void description() {
		System.out.println("My dog has "+legs+" legs and "+eyes+" eyes.");
	}
}
public class Class_and_objects {

	public static void main(String[] args) {
		//Note: there can be only one public in the whole program who's name is equal to the file name.
		// TO MAKE OBJECT OF ANY CLASS WE USE SAME SYNTAX AS WE USE IN SCANNER CLASS.
		laptop g3 = new laptop();
// 	className objectName = new className ();
// pattern to initialize an object is given above.
		
		g3.gaming=true;
		System.out.println(g3.gaming);
		g3.description();
		dog dog1 =new dog();
		dog1.legs=4;
		dog1.eyes=2;
		dog1.description();
	}
}
