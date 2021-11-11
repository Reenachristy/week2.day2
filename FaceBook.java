package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Reena");
		driver.findElement(By.name("lastname")).sendKeys("Test");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		driver.findElement(By.id("password_step_input")).sendKeys("abc@abc");
		
		//To access dropdown write expression, and collect the value in one variable
		
		WebElement dropDown1 = driver.findElement(By.id("day"));
		
		//create object for select method to select dropdown in selenium
		
		Select day = new Select(dropDown1);
		day.selectByValue("5");
		
		WebElement dropDown2 = driver.findElement(By.id("month"));
		Select month = new Select(dropDown2);
		
		month.selectByVisibleText("Oct");
		
		WebElement dropDown3 = driver.findElement(By.id("year"));
		Select year = new Select(dropDown3);
		year.selectByVisibleText("1996");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
	

		
		
		

	}

}
