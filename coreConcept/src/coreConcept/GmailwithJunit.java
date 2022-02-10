package coreConcept;

public class GmailwithJunit {
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
	
	
	public void performAddition_Test()
	{
		
	performAddition(44,44);
	performAddition(10,20);
	}

}
