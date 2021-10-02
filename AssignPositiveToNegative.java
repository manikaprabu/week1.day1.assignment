package firstcode;

public class AssignPositiveToNegative {

	public static void main(String[] args) {
		int input = -23;
		if(input>0) {
			System.out.println("Number " + input + " is postive number");
			input = -1 * input;
			System.out.println("Number converted to negative number " +input);
		}
		else
			System.out.println("Number " + input + " is negative number");

	}
}
