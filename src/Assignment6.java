import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		1 select any checkbox
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[3]")).click();
		WebElement option = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[3]"));
		
//		2. get the label of the textbox and put it into variable
		String selectedoption = option.getAttribute("value");
		System.out.println(selectedoption);
		
//		3. select option in the dropdown
		WebElement dropdowns = driver.findElement(By.name("dropdown-class-example"));
		Select dropdown = new Select(dropdowns);
		dropdown.selectByValue(selectedoption);
		
//		4. enter the grabbed text in edit alert box
		driver.findElement(By.cssSelector("[name='enter-name']")).sendKeys(selectedoption);
		
//		5. click on alert and check whether popup shows grabbed text
		driver.findElement(By.id("alertbtn")).click();
		String alertmsg = driver.switchTo().alert().getText();
		Assert.assertTrue(alertmsg.contains(selectedoption));
		
		
		

	}

}
