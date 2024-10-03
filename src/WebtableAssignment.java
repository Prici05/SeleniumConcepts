import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		for scrolling i need to use javascriptexecutor class
		
//		this javascript executor helps to find hidden elements in the webpage
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
//		To count the number of columns in the table
		System.out.println(driver.findElements(By.cssSelector("[name=\"courses\"] th")).size());

//		To count the number of rows in the table
		System.out.println(driver.findElements(By.cssSelector("[name=\"courses\"] tr")).size());
		
//		To display the 2nd row contents
		for(int i=0;i<driver.findElements(By.cssSelector("[name=\"courses\"] tr:nth-child(3)")).size();i++)
		{
			List<WebElement> contents = driver.findElements(By.cssSelector("[name=\"courses\"] tr:nth-child(3)"));
			System.out.println(contents.get(i).getText());
		}
		
		
	}

}
