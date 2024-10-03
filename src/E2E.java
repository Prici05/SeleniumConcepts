import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
//		Selecting from and to 
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='SXR']")).click();

//     Selecting calendar
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		if(driver.findElement(By.className("picker-second")).getAttribute("style").contains("0.5"))
		{
			System.out.println("Its enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
//		Selecting passengers
		
		driver.findElement(By.xpath("//div[@class='paxinfo']")).click();
		Thread.sleep(2000L);
		for(int i=1;i<4;i++)
		{
		driver.findElement(By.cssSelector("#hrefIncAdt")).click();
		}
		for(int i=1; i<3; i++)
		{
			driver.findElement(By.id("hrefIncChd")).click();
		}
		driver.findElement(By.id("hrefDecChd")).click();
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.cssSelector("#hrefIncInf")).click();
		}
		driver.findElement(By.cssSelector("input[class='buttonN']")).click();
		
//		Selecting currency
		
		WebElement Staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); 
//		 the above function returns the webelement
		Select dropdown = new Select(Staticdropdown);
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());

//		Selecting checkbox
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		
//		selecting search button
		driver.findElement(By.cssSelector("*[value='Search']")).click();
	}

}
