import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPagePracticeWaitEgs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class=\"checkmark\"])[2]")).click();
//		or driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		
		
		//It is not an alert so we are handling with locators
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-success")));
		driver.findElement(By.cssSelector("button#okayBtn")).click();
		driver.findElement(By.cssSelector("button#okayBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[class='form-control']")));
		WebElement dropDowns = driver.findElement(By.cssSelector("select[class='form-control']"));
		Select dropdown = new Select(dropDowns);
		System.out.println("options are" +dropdown);
		dropdown.selectByVisibleText("Student");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.cssSelector("input[name='signin']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".navbar-brand")));
		List <WebElement> NoofButtons= driver.findElements(By.cssSelector("button[class='btn btn-info']"));
		int products = NoofButtons.size();
		for(int i=0;i<products;i++)
		{
			driver.findElements(By.cssSelector("button[class='btn btn-info']")).get(i).click();
		}
		driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
		
		

	}

}
