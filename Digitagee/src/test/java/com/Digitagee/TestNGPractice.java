package com.Digitagee;

import org.testng.annotations.Test;

public class TestNGPractice {
	
	@Test
	public void sendMail() {
		System.out.println("TC: send mail");
	}
	
	
	@Test(dependsOnMethods= {"sendMail"})
	public void replyMail() {
		System.out.println("TC: ReplyMail");
	}
	
	@Test(dependsOnMethods= {"sendMail","replyMail"})
	public void deleteMail() {
		System.out.println("TC: ReplyMail");
	}
	
	

}
