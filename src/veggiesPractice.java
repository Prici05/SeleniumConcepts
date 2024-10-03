import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class veggiesPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		String [] NeededVeggies = {"Brinjal","Mushroom","Banana", "Mango","Walnuts"};
		// The above is declaration of array But if we want to use contains method we need to convert array to arraylist
		
		AddBooks(driver,NeededVeggies);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[@type='button' and text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		
	}
	
	
	public static void AddBooks(WebDriver driver, String [] NeededVeggies)
	{
		// Getting all the veggiesnames from the site 
				List<WebElement> Veggiesnames = driver.findElements(By.cssSelector("h4.product-name"));
				
				int j=0;
				for(int i=0;i<Veggiesnames.size();i++)
				{
				   String [] names = Veggiesnames.get(i).getText().split(" ");
				   String uiveggies = names[0];
				   
				   List Veggiesarraylist = Arrays.asList(NeededVeggies);
				   
				   if(Veggiesarraylist.contains(uiveggies))
				   {
					   j++;
					   driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					   if(j==NeededVeggies.length)
					   {
						   break;
					   }
				   }
			

			}
	}
}


