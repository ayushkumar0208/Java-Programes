package Basic_Java;

public class Matrix_2 {

	public static void main(String[] args) {
		//             column {1,2,0} and others also.
		int matrix[][] = {{1,2,0},{3,4,9},{0,7,3}};
		
		//For printing single element of matrix. 
		System.out.println(matrix[1][0]);
		System.out.println("----");
		//For printing whole column.
		for(int i =0 ; i < 3 ;i++) {
			System.out.println(matrix[1][i]);
		}
		
	}

}
