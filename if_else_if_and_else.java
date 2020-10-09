package Basic_Java;
import java.util.Scanner;
public class if_else_if_and_else {

	public static void main(String[] args) {
		System.out.println("Enter your age :");
		Scanner obj = new Scanner(System.in);
		int age = obj.nextInt();
		
		if(age < 18 ) {
			System.out.println("You are teeneger");
		}else if(age >= 18 && age <=50){
			System.out.println("You are an adult.");
		}else{
			System.out.println("Invalid , Can't say anything !");
		}
		
		
		
		
					
		
	}
		

}


