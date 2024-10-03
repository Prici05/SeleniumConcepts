import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoopingDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
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
		System.out.println(driver.findElement(By.xpath("//div[@class='paxinfo']")).getText());
		
	}

}
