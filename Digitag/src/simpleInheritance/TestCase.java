package simpleInheritance;
import org.junit.Test;

public class TestCase //extends ReusableComponents 
{
//public ReusableComponents rc = new ReusableComponents("FF");
//public ReusableComponents rc = new ReusableComponents();
public ReusableComponents rc = new ReusableComponents(22);

	
@Test
	public void composeAndSendAnEmail()
	{
	System.out.println("Test Case: ComposeAndSendEmail");
		rc.launchApplication();
		rc.loginToApplication();
		rc.composeAndSendEmail();
		rc.send();
		rc.logoutFromApplication();
		rc.closeApplication();
		
	}
	
	public void forwardAnEmail() {
		System.out.println("Test Case: Forward an Email");
		rc.launchApplication();
		rc.loginToApplication();
		rc.composeAndSendEmail();
		rc.send();
		rc.logoutFromApplication();
		rc.closeApplication();
		
	}
	
	public void deleteAnEmail() {
		System.out.println("Test Case: Forward an Email");
		rc.launchApplication();
		rc.loginToApplication();
		rc.composeAndSendEmail();
		rc.send();
		rc.logoutFromApplication();
		rc.closeApplication();
		
	}

}





