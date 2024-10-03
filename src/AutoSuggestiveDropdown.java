import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("sw");
		Thread.sleep(5000);
		List<WebElement> suggestions = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));

		for(int i=0;i<suggestions.size(); i++)

		{

		String text = suggestions.get(i).getText();

		if(text.equals("Switzerland")) {

		   suggestions.get(i).click();
		   break;

		}
		}
		
	}
}

		
