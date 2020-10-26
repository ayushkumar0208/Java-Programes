package Strings;

public class Split {

	public static void main(String[] args) {
		String name = "Ayush kumar arya";
		String[] words = name.split(" ") ;
		//Creates a list of split items .
		for(String i :words) {
			System.out.println(i);
		}

	}

}
