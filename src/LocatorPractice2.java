import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class LocatorPractice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String name = "Prici";
		String Fname = getName(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(Fname);
		driver.findElement(By.cssSelector("button.signInBtn")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.xpath("//p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class=\"login-container\"]/h2")).getText(), "Hello " +name+ ",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();			
	}
	
	public static String getName(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
	    driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String Extractedname = driver.findElement(By.cssSelector("form p")).getText();
		String [] splitname = Extractedname.split("'");
		String Finalname = splitname[1].split("'")[0];
		System.out.println(Finalname);
		return Finalname;
		
	}
	

}
