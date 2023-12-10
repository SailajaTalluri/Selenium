package com.dropdownpractice;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class dropdownElement {
public static void main(String[] args) {
WebDriver driver;
String applicationurladdress = "https://www.globalsqa.com/demo-site/select-dropdown-menu/";
System.setProperty("webdriver.edge.driver","./BrowserDriverFiles/msedgedriver.exe");
System.out.println("******The webdriver of edgedriver path property is sucessfully set to the system******");
driver=new EdgeDriver();
System.out.println("*****Edgedriver was launched sucessfully*****");
driver.get(applicationurladdress);
System.out.println("*****Navigated to the application url address successfully****");
driver.manage().window().maximize();
System.out.println("******The application of globalsqa webdriver window is succesfull maximize*****");
//<select><option value="AFG">Afghanistan</option>
//<option value="ALA">Åland Islands</option>
//<option value="ALB">Albania</option>
//<option value="DZA">Algeria</option>
//<option value="ASM">American Samoa</option>
//<option value="AND">Andorra</option>
//<option value="AGO">Angola</option>
////*[@id="post-2646"]/div[2]/div/div/div/p/select

WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
List<WebElement> abc=dropdown.findElements(By.tagName("option"));
System.out.println(abc.size());
Select select=new Select(dropdown);
List<WebElement> list=select.getOptions();
for(int index=1;index<list.size();index++)
{
	list.get(index).click();
	 String optionstext=list.get(index).getText();
	System.out.println(optionstext);
}

}
}

//Select select=new Select(dropdown);
//select.selectByValue("ASM");
