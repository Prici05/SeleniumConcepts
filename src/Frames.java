import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		In the context of a web browser, a frame is a part of a web page or browser window which displays 
//		content independent of its container, with the ability to load content independently. 
//		The HTML or media elements in a frame may come from a web site distinct from the site providing 
//		the enclosing content.
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());  // tells us how many frames are there in the current window
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
//		or driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("#draggable")).click();
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.cssSelector("#draggable"));
		WebElement target = driver.findElement(By.cssSelector("#droppable"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent(); //returns to the current htm code
		
		

	}

}
