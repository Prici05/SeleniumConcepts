import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalendarAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		String month = "4";
		String date = "5";
		String year = "2025";
		
		String[] ExpectedList  = {month, date, year};
		
		driver.findElement(By.className("react-date-picker__inputGroup")).click();
		driver.findElement(By.className("react-calendar__navigation__label")).click();
		driver.findElement(By.className("react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()=\""+year+"\"]")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
		driver.findElement(By.xpath("//abbr[text()=\""+date+"\"]")).click();
		
		List <WebElement> calendar = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		
		for(int i=0;i<calendar.size();i++)
		{
			System.out.println(calendar.get(i).getAttribute("value"));
			Assert.assertEquals(calendar.get(i).getAttribute("value"), ExpectedList[i]);
		}
		

	}

}
