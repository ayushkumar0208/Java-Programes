package Basic_Java;

public class Type_Casting {

	public static void main(String[] args) {
		
//		We use typecasting for chaging one data type to another 
//		Types of Type casting :
//			1.Automatic Typecasting 
//			2.Mannual Typecasting
//			
//		AUTOMATIC TYPECASTING 
//		It follows a trend of dataTypes .
		byte x=4;
		double y=x;
		System.out.println(x);
		System.out.println(y);
		
//		MANUUAL TYPECASTING
		
		double p=2.34321;
		int myint=(int)p;
		System.out.println(p);
		System.out.println(myint);
	}

}
