package Basic_Java;

public class Method_or_function {

	public static void main(String[] args) {
		//Defining a method outside the static main function.
		// " Static " + returnType functionName (Arguments)
		//                 OR
		//returnType functionNmae (Arguments)
		
		System.out.println(average(3,6));
	}
	static int average(int firstNumber ,int secondNumber) {
		int sum = (firstNumber + secondNumber)/2;
		return sum;
	}
}