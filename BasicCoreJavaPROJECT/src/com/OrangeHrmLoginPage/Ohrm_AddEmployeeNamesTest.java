package com.OrangeHrmLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ohrm_AddEmployeeNamesTest {

public static void main(String[] args) throws InterruptedException {
//WebDriver Interface of Selenium
//We can Add external libraries the Selenium standard alone Jar files are attached and import all webdriver jar files import
WebDriver driver=new ChromeDriver();
//driver.manage().window().maximize();
String applicationUrlAddress="http://183.82.103.245/nareshit/login.php";
System.out.println("Expected Current url address is"+applicationUrlAddress);
//Automating the WebBrowser is Edge Browser
//System.setProperty("webdriver.edge.driver","C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\BasicCoreJavaPROJECT\\BROWSERDriverFiles\\msedgedriver.exe");
System.setProperty("webdriver.chrome.driver","./BROWSERDriverFiles/chromedriver.exe");
// Navigating to the application url address			
driver.get(applicationUrlAddress);
// Validating Login Webpage
String actual_CurrentUrlAddress=driver.getCurrentUrl();
System.out.println("Actual Current Url Address is"+actual_CurrentUrlAddress);
if(actual_CurrentUrlAddress.equals(applicationUrlAddress))
{
	System.out.println("Actual and Expected url address are same :- PASS");
}
else
{
	System.out.println("Actual and Expected Url address are same :- FAIL");
}
System.out.println();

//Login Page title Validation
String ExpectedLoginPageTitle="OrangeHRM - New Level of HR Management";
System.out.println("Expected LoginPage Title is"+ExpectedLoginPageTitle);
String ActualLoginPageTitle=driver.getTitle();
System.out.println("Actual LoginPage Title is"+ActualLoginPageTitle);
if(ActualLoginPageTitle.equals(ExpectedLoginPageTitle))
{
	System.out.println("The Actual and Expected Login Page Title is matched :- PASS");
}
else
{
	System.out.println("The Actual and Expected Login Page Title is matched :- FAIL");
}
System.out.println();

//Login Validation
//<td align="right" class="bodyTXT">Login Name : </td>
String Expected_loginName="Login Name";
System.out.println("Expected login name text message is "+Expected_loginName);
By loginNametextproperty=By.className("bodyTXT");
WebElement loginNametext=driver.findElement(loginNametextproperty);
String Actual_loginName=loginNametext.getText();
System.out.println("Actual login name text message is "+Actual_loginName);
if (Actual_loginName.contains(Expected_loginName))
{
	System.out.println("The Actual and Expected loginName text message is displayed - PASS");
}
else
{
	System.out.println("The Actual and Expected loginName text message is displayed - FAIL");
}
System.out.println();

//<td align="right" class="bodyTXT">Password : </td>
String Expected_passwordText="Password";
System.out.println("Expected password message is "+Expected_passwordText);
By passwordtextproperty=By.xpath("/html/body/form/table[1]/tbody/tr/td[2]/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[1]");
WebElement passwordtext=driver.findElement(passwordtextproperty);
String Actual_passwordText=passwordtext.getText();
System.out.println("Actual password text message is "+Actual_passwordText);
if (Actual_passwordText.contains(Expected_passwordText))
{
	System.out.println("The Expected and Actual password text message is displayed - PASS");
}
else
{
	System.out.println("The Expected and Actual password text message is displayed - FAIL");
}

System.out.println();
						
String userNameTestData="admin"; //Test Data
By userNameProperty=By.name("txtUserName");//Identify the property of an element
WebElement userName=driver.findElement(userNameProperty);
userName.sendKeys(userNameTestData);
System.out.println();
			
String passwordTestData="admin";
By passwordProperty=By.name("txtPassword");
WebElement password=driver.findElement(passwordProperty);
password.sendKeys(passwordTestData);
System.out.println();
			
By LoginButtonProperty=By.className("button");
WebElement LoginButton=driver.findElement(LoginButtonProperty);
LoginButton.click();

//<li>Welcome admin</li>
/*
<div id="option-menu-bar">
<ul id="option-menu">
*/
System.out.println();

String Expected_Welcomeadmin="Welcome admin";
System.out.println("Expected welcome message is "+Expected_Welcomeadmin);
By WelcomeAdminProperty=By.id("option-menu");
WebElement WelcomeAdminText=driver.findElement(WelcomeAdminProperty);
String Actual_WelcomeAdmin=WelcomeAdminText.getText();
System.out.println("Actual welcome message is "+Actual_WelcomeAdmin);
if(Actual_WelcomeAdmin.contains(Expected_Welcomeadmin))
{
System.out.println("The Actual and Expected Welcome Admin Text message is displayed - PASS");
}
			
else
{
System.out.println("The Actual and Expected Welcome Admin Text message is displayed - FAIL");
}
System.out.println();

//<span class="drop current">PIM</span>
//pim
By pimproperty=By.id("pim");
WebElement pimModule=driver.findElement(pimproperty);
Actions pimactions=new Actions(driver);
pimactions.moveToElement(pimModule).build().perform();
//<span>Add Employee</span>
By addemployeeproperty=By.linkText("Add Employee");
WebElement addemployee=driver.findElement(addemployeeproperty);
addemployee.click();

System.out.println();

//iframe="rightMenu"
String Expected_pimaddemployee="PIM : Add Employee";
System.out.println("Expected pim add employee message is "+Expected_pimaddemployee);
By pimaddemployeeProperty=By.className("mainHeading");
driver.switchTo().frame("rightMenu");
WebElement pimaddemployeeText=driver.findElement(pimaddemployeeProperty);
String Actual_pimaddemployee=pimaddemployeeText.getText();
System.out.println("Actual pim add employee message is "+Actual_pimaddemployee);
if(Actual_pimaddemployee.equals(Expected_pimaddemployee))
{
System.out.println("The Actual and Expected pim add employee Text message is displayed - PASS");
}			
else
{
System.out.println("The Actual and Expected pim add employee Text message is displayed - FAIL");
}

System.out.println();

String Expected_Code="9853";
System.out.println("The code value message is "+Expected_Code);
By codeproperty=By.id("txtEmployeeId");
driver.switchTo().defaultContent();
driver.switchTo().frame("rightMenu");
WebElement codevalue=driver.findElement(codeproperty);
String Actual_code=codevalue.getAttribute("value");
System.out.println("Actual code value message is"+Actual_code);
if(Actual_code.equals(Expected_Code))
{
	System.out.println("The Actual and Expected code value is displayed - PASS");
}
else
{
	System.out.println("The Actual and Expected code value is displayed - FAIL");
}

System.out.println();

String Expected_lastname="Last Name ";
System.out.println("Expected lastname message is "+Expected_lastname);
By lastnametextproperty=By.xpath("//label[text()='Last Name ']");
//driver.switchTo().defaultContent();
//driver.switchTo().frame("rightMenu");
WebElement lastnameText=driver.findElement(lastnametextproperty);
String Actual_lastname=lastnameText.getText();
System.out.println("Actual lastname message is "+Actual_lastname);
if(Actual_lastname.contains(Expected_lastname))
{
	System.out.println("The Actual and Expected lastname message is displayed - PASS");
}
else
{
	System.out.println("The Actual and Expected Lastname message is displayed - FAIL");
}

System.out.println();

//<label for="txtEmpFirstName" id="txtEmpFirstName">First Name <span class="required">*</span></label>
String Expected_FirstName="First Name";
System.out.println("Expected first name message is "+Expected_FirstName);
By firstnametextproperty=By.id("txtEmpFirstName");
WebElement firstnametext=driver.findElement(firstnametextproperty);
String Actual_FirstName=firstnametext.getText();
System.out.println("Actual first name message is "+Actual_FirstName);
if (Actual_FirstName.contains(Expected_FirstName))
{
	System.out.println("The Actual and Expected first name message is displayed - PASS");
}
else
{
	System.out.println("The Actual and Expected first name message is displayed - FAIL");
}

System.out.println();

//<label for="txtEmpMiddleName">Middle Name</label>
String Expected_middleName="Middle Name";
System.out.println("Expected middle name message is "+Expected_middleName);
By middlenametextproperty=By.xpath("//label[text()='Middle Name']");
WebElement middlenameText=driver.findElement(middlenametextproperty);
String Actual_middlename=middlenameText.getText();
System.out.println("Actual middle name message is "+Actual_middlename);
if (Actual_middlename.contains(Expected_middleName))
{
	System.out.println("The Actual and Expected middle name text message is displayed - PASS");
}
else
{
	System.out.println("The Actual and Expected middle name text message is displayed - FAIL");
}

System.out.println();

//<label for="txtEmpNickName">Nick Name </label>
String Expected_Nickname="Nick Name";
System.out.println("Expected nick name message is "+Expected_Nickname);
By nicknametextproperty=By.xpath("/html/body/form/div/div[1]/div[2]/label[5]");
WebElement nicknametext=driver.findElement(nicknametextproperty);
String Actual_Nickname=nicknametext.getText();
System.out.println("Actual nick name message is "+Actual_Nickname);
if (Actual_Nickname.contains(Expected_Nickname))
{
	System.out.println("The Actual and Expected nick name text message is displayed - PASS");
}
else
{
	System.out.println("The Actual and Expected nick name text messgae is displayed - FAIL");
}

System.out.println();

//<input type="text" name="txtEmpLastName" id="txtEmpLastName" class="formInputText" maxlength="100" value="">
By lastnameproperty=By.id("txtEmpLastName");
driver.switchTo().defaultContent();
driver.switchTo().frame("rightMenu");
WebElement lastname=driver.findElement(lastnameproperty);
lastname.sendKeys("sailaja");

Actions keyBoardActions=new Actions(driver);
keyBoardActions.sendKeys(Keys.TAB).build().perform();
keyBoardActions.sendKeys("talluri").build().perform();

keyBoardActions.sendKeys(Keys.TAB).build().perform();
keyBoardActions.sendKeys("naga").build().perform();

keyBoardActions.sendKeys(Keys.TAB).build().perform();
keyBoardActions.sendKeys("sailu").build().perform();

keyBoardActions.sendKeys(Keys.TAB).build().perform();

keyBoardActions.sendKeys(Keys.TAB).build().perform();
keyBoardActions.sendKeys(Keys.ENTER).build().perform();

System.out.println();

//<input type="text" class="formInputText" disabled="disabled" name="txtEmpFirstName" id="txtEmpFirstName" maxlength="100" value="talluri">
String ExpectedFirstNamevalue="talluri";
System.out.println("The Expected FirstName value message is "+ExpectedFirstNamevalue);
By FirstNamevalueproperty=By.id("txtEmpFirstName");
WebElement FirstNameValue=driver.findElement(FirstNamevalueproperty);
String ActualFirstNameValue=FirstNameValue.getAttribute("value");
System.out.println("The Actual firstname value message is "+ActualFirstNameValue);
if(ActualFirstNameValue.equals(ExpectedFirstNamevalue))
{
	System.out.println("The Actual and Expected firstname value is displayed = PASS");
}
else
{
	System.out.println("The Actual and Expected first name value is displayed = FAIL");
}
System.out.println();

//<input type="text" class="formInputText" disabled="disabled" name="txtEmpLastName" id="txtEmpLastName" maxlength="100" value="sailaja">
String ExpectedLastNamevalue="sailaja";
System.out.println("The Expected last name value message is "+ExpectedLastNamevalue);
By lastNamevalueproperty=By.id("txtEmpLastName");
WebElement lastNameValue=driver.findElement(lastNamevalueproperty);
String ActuallastNameValue=lastNameValue.getAttribute("value");
System.out.println("The Actual last name value message is "+ActuallastNameValue);
if(ActuallastNameValue.equals(ExpectedLastNamevalue))
{
	System.out.println("The Actual and Expected last name value is displayed = PASS");
}
else
{
	System.out.println("The Actual and Expected last name value is displayed = FAIL");
}

System.out.println();

//<input type="text" class="formInputText" disabled="disabled" name="txtEmpMiddleName" id="txtEmpMiddleName" maxlength="100" value="naga">
String Expectedmiddlenamevalue="naga";
System.out.println("The expected middle name value message is "+Expectedmiddlenamevalue);
By middlenamevalueproperty=By.id("txtEmpMiddleName");
WebElement middlenamevalue=driver.findElement(middlenamevalueproperty);
String Actualmiddlenamevalue=middlenamevalue.getAttribute("value");
System.out.println("The Actual middle name value message is"+Actualmiddlenamevalue);
if(Actualmiddlenamevalue.equals(Expectedmiddlenamevalue))
{
	System.out.println("The Actual and Expected middle name value is displayed = PASS");
}
else
{
	System.out.println("The Actual and Expected middle name value is displayed = FAIL");
}

System.out.println();

//<input type="text" class="formInputText" disabled="disabled" name="txtEmpNickName" id="txtEmpNickName" maxlength="100" value="sailu">
String Expectednicknamevalue= "sailu";
System.out.println("The expected nick name value message is "+Expectednicknamevalue);
By nicknamevalueproperty=By.id("txtEmpNickName");
WebElement nicknamevalue=driver.findElement(nicknamevalueproperty);
String Actualnicknamevalue=nicknamevalue.getAttribute("value");
System.out.println("The Actual nick name value message is"+Actualnicknamevalue);
if(Actualnicknamevalue.equals(Expectednicknamevalue))
{
	System.out.println("The Actual and Expected nick name value is displayed = PASS");
}
else
{
	System.out.println("The Actual and Expected nick name value is displayed = FAIL");
}

System.out.println();

//<span id="empname">talluri naga sailaja</span>
String ExpectedEmployeepersonaldetails="talluri naga sailaja";
System.out.println("The employee personal details message is"+ExpectedEmployeepersonaldetails);
By employeenameproperty=By.id("empname");
WebElement employeename=driver.findElement(employeenameproperty);
String ActualEmployeepersonaldetails=employeename.getText();
System.out.println("The actual employee personal details message is" +ActualEmployeepersonaldetails);
if (ActualEmployeepersonaldetails.equals(ExpectedEmployeepersonaldetails))
{
	System.out.println("The Actual and Expected employee personal details of employee name is displayed = PASS");
}
else
{
	System.out.println("The Actual and Expected employee personal details of employee name is displayed = Fail");
}


/*
By backbuttonproperty=By.className("backbutton");
driver.switchTo().defaultContent();
driver.switchTo().frame("rightMenu");
WebElement backbutton=driver.findElement(backbuttonproperty);
backbutton.click();
System.out.println("Action performed by backbutton");
*/
}
}



