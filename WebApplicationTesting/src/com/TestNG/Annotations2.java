package com.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {

@BeforeTest(description="Gmail Application Launch")
public void GmailApplicationLaunch()
{
	System.out.println("***** Gmail Application Launch Successfully *****");
}
	

@Test(priority=1,description="Validating Login Functionality")
public void GmailApplicationLoginTest()
{
	System.out.println("Login Functionality Successfull");
}

@Test(priority=2,description="Validating InBox Functionality")
public void GmailApplicationInBoxTest()
{
	System.out.println("InBox Functionality Test Successfull");
}

@Test(priority=3,description="Validating ComposeMail Functionality")
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

@Test(priority=5,description="Validating Sent Mail Functionality")
public void GmailApplicationSentMailTest()
{
	System.out.println("Sent Mail Functionality Test Successfull");
}


@AfterTest
public void GmailApplicationClose()
{
	System.out.println("**** Gmail Application Close Successfully *****");
}
}