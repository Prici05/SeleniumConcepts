import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		Traversing from parent to child and then from one sibling to next sibling
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[2]")).getText());
		
//		Traversing from child to parent
//		//header/div/button[1]/parent::div
//		Sibling to parent traverse

		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[2]/parent::div/parent::header/a[2]")).getText());
		
		

	}

}
