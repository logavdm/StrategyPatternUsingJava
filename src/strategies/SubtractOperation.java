package strategies;

public class SubtractOperation extends Strategy {

	@Override
	public void doOperation(int num1, int num2) {
	
		System.out.println("The Subtraction is :"+(num1-num2));
		
	}
}
