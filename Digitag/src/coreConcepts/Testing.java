package coreConcepts;

import org.junit.Test;

public class Testing {
	
	
	public void performAddition(int a,int b)
	{
	System.out.println("A value: " + a);
	System.out.println("B value: " + b);
	if(a==b)
	{
	int sum=a+b;
	System.out.println("Sum of two numbers= " + sum);
	}
	else
	{
	int diff=a-b;
	System.out.println("Difference of two numbers is: "+ diff);
	}

	}
	
	@Test
	public void performtest()
	{
		
	performAddition(44,44);
	performAddition(10,20);
	
	}


}
