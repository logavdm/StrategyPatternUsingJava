package context;

import strategies.Strategy;

public class ExecuteClass {
	
	private Strategy strategy;
	
	public ExecuteClass(Strategy s)  {
	
		this.strategy=s;
	}

	
	public void executeStrategy(int num1,int num2)
	{
		strategy.doOperation(num1, num2);
	}

	
}
