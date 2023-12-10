package AmazonApplication;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonApplicationPractice {

public static void main(String[] args) throws InterruptedException {
WebDriver driver;
String applicationUrlAddress="http://www.amazon.in";

//Automating the ChromeBrowser
System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
driver=new ChromeDriver();
driver.get(applicationUrlAddress);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

/*
<a href="javascript: void(0)" id="nav-hamburger-menu" role="button" aria-label="Open Menu" data-csa-c-type="widget" data-csa-c-slot-id="HamburgerMenuDesktop" data-csa-c-interaction-events="click" data-csa-c-id="5rvzhj-oy1npl-46qauz-yi9emu">
<i class="hm-icon nav-sprite"></i>
<span class="hm-icon-label">All</span>
</a>
*/
By AllHeaderProperty=By.id("nav-hamburger-menu");
WebElement AllHeader=driver.findElement(AllHeaderProperty);
AllHeader.click(); 

//xpath=//*[@id="hmenu-content"]/ul[1]/li[31]/a
By signinproperty=By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[32]/a");
WebElement signin=driver.findElement(signinproperty);
Thread.sleep(5000);
signin.click();

By mobileNoproperty=By.xpath("//*[@id=\"ap_email\"]");
WebElement mobileNo=driver.findElement(mobileNoproperty);
mobileNo.sendKeys("8074459824");

By continuebuttonproperty=By.id("continue");
WebElement continuebutton=driver.findElement(continuebuttonproperty);
continuebutton.click();

By passwordproperty=By.id("ap_password");
WebElement password=driver.findElement(passwordproperty);
password.sendKeys("cutesailu");

By signinbuttonproperty=By.id("signInSubmit");
WebElement signinbutton=driver.findElement(signinbuttonproperty);
signinbutton.click();

//<span class="nav-cart-icon nav-sprite"></span>
By cartproperty=By.id("nav-cart-count");
WebElement cart=driver.findElement(cartproperty);
Actions action=new Actions(driver);
action.moveToElement(cart).build().perform();
cart.click();

//class= sc-product-image
By shoppingcartproperty=By.className("sc-product-image");
WebElement shoppingcart=driver.findElement(shoppingcartproperty);
Actions act=new Actions(driver);
act.moveToElement(shoppingcart).build().perform();
shoppingcart.click();
/*
JavascriptExecutor jsExecutor =(JavascriptExecutor) driver;
jsExecutor.executeScript(Window.("add-to-cart-button").click());
//<input id="add-to-cart-button" name="submit.add-to-cart" title="Add to Shopping Cart" data-hover="Select <b>__dims__</b> from the left<br> to add to Shopping Cart" data-ref="" class="a-button-input" type="submit" value="Add to Cart" aria-labelledby="submit.add-to-cart-announce" formaction="/cart/add-to-cart/ref=dp_start-bbf_1_glance">
By addtocartbuttonproperty=By.id("add-to-cart-button");
WebElement addtocartbutton=driver.findElement(addtocartbuttonproperty);
addtocartbutton.click();
*/
}
}




/*
//Scroll down the driver
 JavascriptExecutor js =(JavascriptExecutor) driver;
 js.executeScript("window.scroll(0,300)");
*/
