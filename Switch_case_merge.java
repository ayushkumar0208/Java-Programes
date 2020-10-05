package Basic_Java;

import java.util.Scanner;

public class Switch_case_merge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n :");
		int dayofweek = sc.nextInt();
		switch(dayofweek) {
		case 1 : case 2:
			System.out.println("football");
			break;
		case 3 :case 4: case 5: case 6:
			System.out.println("cricket");
			break;
		default:
			System.out.println("Rest");
		}

	}

}
