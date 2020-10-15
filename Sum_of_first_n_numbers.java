package Programs;
import java.util.Scanner;
public class Sum_of_first_n_numbers {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number :");
		int n = obj.nextInt();
		int i =1;
		int s = 0;
		while(i <= n) {
			s=s+i;
			i++;
		}
		System.out.println("The sum of first " + n + " numbers = " +s);
	}

}
