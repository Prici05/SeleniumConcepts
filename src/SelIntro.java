import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SelIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "/Users/earockia/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println("TITLE OF THE PAGE" + driver.getTitle());
		System.out.println("URL OF THE PAGE" + driver.getCurrentUrl());
		driver.close();
		
		

	}

}
