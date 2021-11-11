package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("UserFirstName")).sendKeys("Reena");
		driver.findElement(By.name("UserLastName")).sendKeys("Christy");
		driver.findElement(By.name("UserEmail")).sendKeys("ssreenachristy@gmail.com");
		WebElement dropDown1 = driver.findElement(By.name("UserTitle"));
		Select jobTitle = new Select(dropDown1);
		jobTitle.selectByIndex(7);
		
		driver.findElement(By.name("CompanyName")).sendKeys("Cognizant");
		WebElement dropDown2 = driver.findElement(By.name("CompanyEmployees"));
	
		Select employees = new Select (dropDown2);
		employees.selectByValue("1600");
		
		driver.findElement(By.name("UserPhone")).sendKeys("9944800970");
		
		WebElement dropDown3 = driver.findElement(By.name("CompanyCountry"));
		
		Select companyCountry = new Select (dropDown3);
		companyCountry.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}