import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
//		driver.findElement(By.xpath("//ul/li[33]")).click(); or
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String Parent = it.next();
		String Child = it.next();
		driver.switchTo().window(Child);
		System.out.println(driver.findElement(By.cssSelector("div[class=\"example\"] h3")).getText());
		driver.switchTo().window(Parent);
		System.out.println(driver.findElement(By.cssSelector("div[class=\"example\"] h3")).getText());

	}

}
