import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LocatorPractice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Prici");
		driver.findElement(By.name("inputPassword")).sendKeys("12345");
		driver.findElement(By.cssSelector("button.signInBtn")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		the above wait is used to wait to show objects on the page
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
//		the above thread sleep is used to get something in a stable state
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Prici");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("prici5499@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("prici@gmail.com");
//		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("prici@gmail.com); ---> CSS selector
	    driver.findElement(By.xpath("//form/input[3]")).sendKeys("9600774214");
	    driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
	    System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	    driver.findElement(By.xpath("//div[@class=\"forgot-pwd-btn-conainer\"]/button[1]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Prici");
	    driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("rahulshettyacademy");
	    driver.findElement(By.name("chkboxOne")).click();
	    driver.findElement(By.cssSelector("button[class*='submit']")).click();
		
		
//		driver.close();
		
	}

}
