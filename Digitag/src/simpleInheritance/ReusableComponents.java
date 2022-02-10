package simpleInheritance;

public class ReusableComponents {
	
	int version;
	public ReusableComponents() {
		version = 20;
		System.out.println("clear all cache");
		System.out.println("open default browser as Google chrome");
				
	}
	public ReusableComponents(String Browser) {
		version = 20;
		System.out.println("clear all cache");
		System.out.println("open user Specific browser as " +Browser);
				
	}
	
	public ReusableComponents(int VersionNumber) {
		version = VersionNumber;
		System.out.println("clear all cache");
		System.out.println("open default browser" +VersionNumber);
				
	}
	
	
	
	void launchApplication() {
		System.out.println("RC: Launch Application");
	}
	
	protected void loginToApplication() {
		System.out.println("RC: login to Application");
	}
	
	void logoutFromApplication() {
		System.out.println("RC:close Application");
	}
	
	protected void closeApplication() {
		System.out.println("RC:Close Application");
	}
	
	void composeAndSendEmail() {
		System.out.println("RC: compose an email");
	}
	public void send() {
		System.out.println("RC: send an email");
	}
	void open() {
		System.out.println("RC:open an email");
	}
	public void replyToAnEmail() {
		System.out.println("RC: reply an email");
	}
	public void forward() {
		System.out.println("RC: forward an email");
	}

}
