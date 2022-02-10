package simpleInheritance;

public class TestSuites //extends Test
{
	public TestCase tc = new TestCase();
	
	
	public void smokeSuits() {
		System.out.println("Test Suite: Smoke");
		tc.composeAndSendAnEmail();
		tc.forwardAnEmail();


	}
	
	public void regressionSuit()
	{
		System.out.println("Test  Suite :REGRESSION");
		tc.composeAndSendAnEmail();
		tc.forwardAnEmail();
		tc.deleteAnEmail();
		
	}

}
