import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT"));
		System.out.println("The selected departure state is " + element.getAttribute("value"));
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='SXR']")).click();
		
		WebElement element2 = driver.findElement(By.cssSelector("input[name='ctl00_mainContent_ddl_destinationStation1_CTXT']"));
		System.out.println("The selected arrival state is " + element2.getAttribute("value"));
	}

}
