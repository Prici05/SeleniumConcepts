import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsMaximiseandCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
//		for maximising window
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		
//		for cookies related options
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("sessionId");
		driver.manage().getCookieNamed("String");

	}

}
