import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
//		To count the number of links in the footer tab
		WebElement footer = driver.findElement(By.cssSelector("#gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
//		To count the number of links in the first column in the footer tab
		WebElement footercol1 = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(footercol1.findElements(By.tagName("a")).size());
		
		Thread.sleep(5000);
		
//		click on each link on the first column and grab the title
		for(int i=1;i<footercol1.findElements(By.tagName("a")).size();i++)
		{
			String clickoneachlink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			System.out.println(clickoneachlink);
			footercol1.findElements(By.tagName("a")).get(i).sendKeys(clickoneachlink);
			Thread.sleep(10000);
		}
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		while(it.hasNext())//checks whether windows are opened next
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
	}

}
