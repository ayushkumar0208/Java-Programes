package Basic_Java;

public class Matrix_1 {

	public static void main(String[] args) {
		int matrix[][] = new int[3][3];
		//                   [row][column]
		matrix[0][0] = 1 ;
		matrix[0][1] = 2 ;
		matrix[0][2] = 6 ;
		matrix[1][0] = 5 ;
		matrix[1][1] = 4 ;
		matrix[1][2] = 9 ;
		matrix[2][0] = 7 ;
		matrix[2][1] = 3 ;
		matrix[2][2] = 2 ;
		
		//For printing single element.
		System.out.println(matrix[2][2]);
		System.out.println("----");
		//For printing complete row .
		for(int i=0 ; i<3 ; i++) {
			System.out.println(matrix[i][1]);
		}
		
		

	}

}
