import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("prici");
		driver.findElement(By.xpath("(//form/div[@class='form-group']/input)[2]"))
				.sendKeys("arockiapricilla1999@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("prici");
		driver.findElement(By.id("exampleCheck1")).click();

		WebElement options = driver.findElement(By.cssSelector("#exampleFormControlSelect1"));
		System.out.println("Options are" + options);
		Select dropdown = new Select(options);
		dropdown.selectByVisibleText("Female");

		driver.findElement(By.xpath("(//div/input)[6]")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("05041999");

		driver.findElement(By.cssSelector("input[type$='submit']")).click();

		Thread.sleep(2000);
		System.out.println(
				driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());

	}

}
