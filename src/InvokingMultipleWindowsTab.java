import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingMultipleWindowsTab {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.switchTo().newWindow(WindowType.TAB); // invoking another tab
//driver.switchTo().newWindow(WindowType.WINDOW)		 invoking new window
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it= handles.iterator();
		
		String Parentid= it.next();
		String childid= it.next();
		
		driver.switchTo().window(childid);
		
		driver.get("https://rahulshettyacademy.com/");
		
		String course = driver.findElement(By.xpath("(//h2/a)[1]")).getText();
		System.out.println(course);
		
		driver.switchTo().window(Parentid);
		
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(course);
		
//		Taking partial screenshot/webelement screenshot
		
		File image = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(image, new File("logo.png"));
		
//		knowing width and height of the box
		System.out.println(name.getRect().getDimension().getWidth());
		System.out.println(name.getRect().getDimension().getHeight());
		
		
	}

}
