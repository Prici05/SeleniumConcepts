import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTablesortingusingJavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
//		1. click on the first column heading to sort the table
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
//		2. Grab the names of first columns and put it in the list
		List<WebElement> elements = driver.findElements(By.xpath("//tr/td[1]"));
		
//		3.capture text of all webelements into new(original) list
		List<String> list1 = elements.stream().map(s->s.getText()).collect(Collectors.toList());
		
//		4. sort on the original list of step 3 -> sorted list
		List<String> sortedList1 = list1.stream().sorted().collect(Collectors.toList());
		
//		compare the original list after clicking product button and sorted list by taking elements and getting text
		Assert.assertTrue(list1.equals(sortedList1));
		
//		To get the price of the rice
		List<String> price;
		do
		{
		List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
		price = rows.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPriceVeggie(s)).collect(Collectors.toList());
		price.forEach(a -> System.out.println(a));
		if(price.size()<1)
		{
		driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		}while(price.size()<1);
		}
	    private static String getPriceVeggie(WebElement s) {

		// TODO Auto-generated method stub

		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;

		}
	}

