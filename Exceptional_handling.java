package Basic_Java;

public class Exceptional_handling {

	public static void main(String[] args) {
		try {
			int a[]= {1,2,3,4,5};
			System.out.println(a[5]);
			System.out.println("try working currently !");
		} catch(Exception e) {
			System.out.println("Error aaya tha !");
		}

	}

}
