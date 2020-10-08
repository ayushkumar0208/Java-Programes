package Basic_Java;

public class Array_1 {

	public static void main(String[] args) {
		//type 1 of defining array 
		int marks[] = new int[5];
		marks[0] = 23;
		marks[1] = 54;
		marks[2] = 59;
		marks[3] = 86;
		marks[4] = 48;
		
		for(int i=0; i<marks.length ; i++) {
			System.out.println(marks[i]);
		}
	}

}
