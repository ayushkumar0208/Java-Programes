package Programs;
import java.util.Scanner;
public class Table_of_any_number {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter Number:");
		int num = obj.nextInt();
		System.out.println("============");
		System.out.println("TABLE OF " + num);
		System.out.println("============");
		for(int i = 1;i <=10 ; i++) {
			System.out.println(num + " X " + i + " = " + num*i);
		}

	}

}
