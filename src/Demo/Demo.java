package Demo;

import strategies.AddOperation;
import context.ExecuteClass;

public class Demo {

	
	public static void main(String[] args) {
		
		
		ExecuteClass exec=new ExecuteClass(new AddOperation());
		
		exec.executeStrategy(10,20);
		
		
	}
}
