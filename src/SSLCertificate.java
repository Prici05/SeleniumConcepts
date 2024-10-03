import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Chrome option is a class responsible for handling certifications and other related issues in web browser
		
		ChromeOptions option  = new ChromeOptions();
		
//		for setting up proxy related
	    Proxy proxy = new Proxy();
	    proxy.setHttpProxy("ipadress:portno");
	    option.setCapability("proxy", proxy);
	    
//	    For putting downloaded files in to required path
	    Map<String, Object> prefs = new HashMap<String, Object>();
	    prefs.put("download.default_directory", "/directory/path");
	    option.setExperimentalOption("prefs", prefs);
	    
		
//		For handling ssl certifications
		option.setAcceptInsecureCerts(true); 
		
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://expired.badssl.com/");
		
		System.out.println(driver.getTitle());
		

	}

}


