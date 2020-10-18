package Programs;

import java.util.Scanner;

public class Addition_of_two_matrix {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number of rows :");
		int rows = sc.nextInt();
		System.out.print("Enter Number of columns :");
		int cols = sc.nextInt();
		
		int a[][] = new int [rows][cols];
		int b[][] = new int [rows][cols];
		System.out.println("Enter following details :");
		System.out.println();
		for(int i = 0; i<rows;i++) {
			for(int j =0;j<cols;j++) {
				System.out.print("Enter A["+i+"]"+"["+j+"]"+" :");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("You have successfully entered values of matrix A");
		
		
		for(int i = 0; i<rows;i++) {
			for(int j =0;j<cols;j++) {
				System.out.print("Enter B["+i+"]"+"["+j+"]"+" :");
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("You have successfully entered values of matrix B");
		
		int c[][] = new int[rows][cols];
		for(int i = 0; i<rows;i++) {
			for(int j =0;j<cols;j++) {
				c[i][j] = a[i][j] +b[i][j];
			}
		}
		System.out.println();
		System.out.println("RESULTANT MATRIX");
		System.out.println();
		for(int i = 0; i<rows;i++) {
			System.out.print("|");
			for(int j =0;j<cols;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.println("Done");

	}

}
