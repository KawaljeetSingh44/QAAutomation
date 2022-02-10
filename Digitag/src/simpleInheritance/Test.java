package simpleInheritance;


public class Test extends ReusableComponents {
	
	public ReusableComponents rc = new ReusableComponents("FF");

	public void composeAndSendAnEmail()
	{
		System.out.println("Test Case: ComposeAndSendEmail");
		launchApplication();
		loginToApplication();
		composeAndSendEmail();
		send();
		logoutFromApplication();
		closeApplication();
		
	}
	
	public void forwardAnEmail() {
		System.out.println("Test Case: Forward an Email");
		launchApplication();
		loginToApplication();
		composeAndSendEmail();
		send();
		logoutFromApplication();
		closeApplication();
		
	}
	
	public void deleteAnEmail() {
		System.out.println("Test Case: Forward an Email");
		launchApplication();
		loginToApplication();
		composeAndSendEmail();
		send();
		logoutFromApplication();
		closeApplication();
		
	}

}


