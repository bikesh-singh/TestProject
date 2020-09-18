package testProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SignUpdetails {

	@SuppressWarnings("null")
	public void signUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BikeshSingh\\Desktop\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jt-dev.azurewebsites.net/#/SignUp");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Bikesh Singh");
		
		driver.findElement(By.xpath("//input[@id='orgName']")).sendKeys("example@gmail.com");
		
		driver.findElement(By.xpath("//input[contains(@id,'singUp')]")).sendKeys("example@gmail.com");
		
		driver.findElement(By.xpath("//span[@class='black-color ng-binding']")).click();
		
		
		
		
		if(driver.findElement(By.xpath("//div[@class='form-group custom-form-group']")).isEnabled()) {
			driver.findElement(By.xpath("//div[@class='form-group custom-form-group']")).click();
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			WebDriverWait wait = new WebDriverWait(driver, 20);
			{
				
			
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@name='signUpForm']/div/span")));
			}
		} catch (NoSuchElementException e){
			
		}
		
		
		if(driver.findElement(By.xpath("//form[@name='signUpForm']/div/span")).isDisplayed()) {
			String strText =  driver.findElement(By.xpath("//form[@name='signUpForm']/div/span")).getText().trim();
			
			System.out.println(strText);
		}
		
		driver.close();
		
	}
	
	
}
