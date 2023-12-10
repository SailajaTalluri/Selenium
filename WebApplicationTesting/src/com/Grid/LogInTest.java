package com.Grid;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LogInTest {

@Parameters("Browser")
	@Test
	public void logInTest(String browserName) throws MalformedURLException, IOException, InterruptedException
	{
		//setting up the Grid Environment
		System.out.println("The name of the Browser is :-"+browserName);
		//DesriedCapabilites - it is used to connect to node system
		//Should be set with the Browser information along with the platform on which 
		//The Test should be executed
		DesiredCapabilities capibilities = null;
		if(browserName.equals("chrome"))
		{
			capibilities=DesiredCapabilities.chrome();
			capibilities.setBrowserName("chrome");
			capibilities.setPlatform(Platform.WINDOWS);
		}
		else
			if(browserName.equals("edge"))
			{
				capibilities=DesiredCapabilities.edge();
				capibilities.setBrowserName("edge");
				capibilities.setPlatform(Platform.WINDOWS);
				
			}
		
		
		//Connecting to Hub Server
		//RemoteWebDriver - should be provided with information related to connecting to
		// Hub Server and its connected corresponding nodes
		RemoteWebDriver driver=new RemoteWebDriver(new URL("  http://192.168.0.110:4444/wd/hub"),capibilities);
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";	
		driver.get(applicationUrlAddress);
		
		//Excel File - with TestData
		FileInputStream orangeHRMApplicationLogInTestDataFile=new FileInputStream("./src/com/OrangeHRMApplicationLoginTestResultFile/OrangeHRMApplicationLoginTestResultFile.xlsx");
		 XSSFWorkbook workBook=new XSSFWorkbook(orangeHRMApplicationLogInTestDataFile);
		 XSSFSheet testDataFile=workBook.getSheet("LogInTestData");
		 Row testDataRow=testDataFile.getRow(1);
		 
		 Cell testDataRowOfCell_UserName=testDataRow.getCell(0);
		 String UserNameTestData=testDataRowOfCell_UserName.getStringCellValue();
		 //String userNameTestData="Admin"; //Test Data
		 
		 System.out.println("The User Name is "+UserNameTestData);
		 //<input name="txtUsername" id="txtUsername" type="text">
		 //Identifying the property of an element UserName
		 By userNameProperty=By.id("txtUsername");
		 WebElement UserName=driver.findElement(userNameProperty);
		 //Performing an operation UserName Property
		 UserName.sendKeys(UserNameTestData);
		 
		 
		 Cell testDataRowOfCell_Password=testDataRow.getCell(1);
	     String PasswordTestData=testDataRowOfCell_Password.getStringCellValue();
	     //String PasswordTestData="Livetech@123"; //Test Data
		 System.out.println("The Password Name is "+PasswordTestData);
		 //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		 By PasswordProperty=By.id("txtPassword");
		 WebElement password=driver.findElement(PasswordProperty);
		 password.sendKeys(PasswordTestData);
		 
		 //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		By LoginbuttonProperty=By.className("button");
         WebElement LoginButton=driver.findElement(LoginbuttonProperty);
         LoginButton.click();
         
        // <a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
         By WelcomeAdminProperty=By.id("welcome");
         WebElement WelcomeAdmin=driver.findElement(WelcomeAdminProperty);
         String Expected_OrangeHRMApplicationHomePageText="Admin";
         System.out.println("The Expected OrangeHRM Application Home Page is"+Expected_OrangeHRMApplicationHomePageText);
         
         String Actual_OrangeHRMApplicationHomePageText=WelcomeAdmin.getText();
         System.out.println("The Actual OrangeHRM Application Home Page is"+Actual_OrangeHRMApplicationHomePageText);
         
         if(Actual_OrangeHRMApplicationHomePageText.contains(Expected_OrangeHRMApplicationHomePageText))
         {
        	 Cell testDataRowOfCell=testDataRow.createCell(2);
        	 System.out.println("Successfully Navigated to OrangeHRMApplication HomePage is PASS");
         }
         else
         {
        	 Cell testDataRowOfCell=testDataRow.createCell(2);
        	 System.out.println("Successfully Navigated to OrangeHRMApplication HomePage is FAIL");
         }
         
         // Test Results exporting to another Excel File - along with Test Data
         FileOutputStream OrangeHRMApplicationLoginTestDataFile=new FileOutputStream ("./src/com/OrangeHRMApplicationLoginTestResultFile/OrangeHRMApplicationLoginTestResultFile.xlsx");
         workBook.write(OrangeHRMApplicationLoginTestDataFile);
		 
         WelcomeAdmin.click();

      // Synchronization
      Thread.sleep(5000); // Java Wait
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		By logoutProperty=By.linkText("Logout");
		WebElement logout=driver.findElement(logoutProperty);
		logout.click();
		
		driver.quit();
		
	}
	
}
