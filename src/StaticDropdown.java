import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement Staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); 
		System.out.println("options are" +Staticdropdown);
//		 the above function returns the webelement
		Select dropdown = new Select(Staticdropdown);
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
//		System.out.println(driver.findElement(By.cssSelector("select[id=\"ctl00_mainContent_DropDownListCurrency\"]")).getText());
//		The above print statement returns all the values such as INR, AED and USD

	}

}
