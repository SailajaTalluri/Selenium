package com.TestNG;

import org.testng.annotations.Test;

public class Annotations1 {

//@Test //is called as a TestCase
// The functionality which is under Test of an application should be created as a
//user-defined method implementing @Test annotation of TestNG-because it represents to
	//a test case
	//the user-defined method names are referred to as TestCaseNames
	//TestNG when Executes multiple Test Cases-the Test cases executes based on the 
	//Alphabetical order of the given test case names
	//Multiple Test cases are executed in an Alphabetical order starting with UpperCaseLetters
	//Test cases with UpperCaseletters
	
	@Test(priority=1,description="Gmail Application Launch")
	public void GmailApplicationLaunch()
	{
		System.out.println("***** Gmail Application Launch Successfully *****");
	}
	
	
	@Test(priority=2,description="Validating Login Functionality")
	public void GmailApplicationLoginTest()
	{
		System.out.println("Login Functionality Successfull");
	}
	
	@Test(priority=3,description="Validating InBox Test")
	public void GmailApplicationInBoxTest()
	{
		System.out.println("InBox Functionality Test Successfull");
	}
	
	@Test(priority=4,description="Validating ComposeMail Functionality")
	public void GmailApplicationComposeMailTest()
	{
		System.out.println("ComposeMail Functionality Test Successfull");
	}
	
	@Test(enabled=false,description="Validating Drafts Functionality")
	//This is a false Test case - TestNG during the Test Run will ignore the 
	//current Test Case
	public void GmailApplicationDraftsTest()
	{
		System.out.println("Drafts Functionality Test Successfull");
	}
	
	@Test(priority=6,description="Validating Sent Mail Functionality")
	public void GmailApplicationSentMailTest()
	{
		System.out.println("Sent Mail Functionality Test Successfull");
	}
	
	
	@Test(priority=7,description="Gmail Application Successfully closed")
	public void GmailApplicationClose()
	{
		System.out.println("***** Gmail Application Successfully Closed ******");
	}
	
    }
