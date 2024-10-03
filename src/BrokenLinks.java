import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
//		Broken links are broken url ie) url is not working it gives error greater than 400
//		For that we need to take all the urls from the page using selenium
//		then we need to use one method called openconnection to get the response of the page and then validate if the response is >400
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		SoftAssert a = new SoftAssert();
		
		List<WebElement> links = driver.findElements(By.cssSelector("li[class=\"gf-li\"] a"));
		for(WebElement link: links)
		{
			String url = link.getAttribute("href");
			
			HttpURLConnection connection =  (HttpURLConnection) new URL(url).openConnection();
			connection.setRequestMethod("HEAD");
			connection.connect();
			int responseCode = connection.getResponseCode();
			
			a.assertTrue(responseCode<400, "The failure is due to the broken link with link name as " +link.getText()+ " with status code as " +responseCode);
			
		}
		
			a.assertAll();
			
		}
	
//	Soft assert - it is used to store all the errors until execution and then finally it will throw the error

	}


