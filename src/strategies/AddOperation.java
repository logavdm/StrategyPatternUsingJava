package strategies;

public class AddOperation extends Strategy{

	@Override
	public void doOperation(int num1, int num2) {
	
		System.out.println("The Addition is:"+(num1+num2));
		
	}
}
