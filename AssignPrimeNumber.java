package firstcode;

public class AssignPrimeNumber {

	public static void main(String[] args) {
		int Input =14;
		boolean flag = false;
		int j = Input/2;
		for (int i = 2; i <= j; i++) {
			if(Input%i ==0) {
				flag = true;
				break;
			}
		}
		if(flag==true)
			System.out.println(Input + " is Prime number");
		else
			System.out.println(Input + " is not Prime number");
	}

}
