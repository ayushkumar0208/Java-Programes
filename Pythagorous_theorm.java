package Programs;
import java.util.Scanner;
public class Pythagorous_theorm {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Perpendicular :");
		double perpendicular = obj.nextDouble();
		System.out.println("Enter Base :");
		double base = obj.nextDouble();
		double hypotenuse = Math.sqrt(perpendicular*perpendicular + base*base);
		System.out.println();
		System.out.println("By using formula h*h = p*p + b*b");
		System.out.println("Hypotenuse is :" + hypotenuse );
		//Math.sqrt works in double Data type.
		
		
	}

}
