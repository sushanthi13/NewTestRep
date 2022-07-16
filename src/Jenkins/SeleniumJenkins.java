package Jenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumJenkins {
	@Test
	public void intilialize() throws Exception {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver  driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus8t");
	driver.findElement(By.id("nav-search-submit-button")).click();
	System.out.prinltn("deff");
	
	
	driver.navigate().back();
	System.out.println("Title of the page" +driver.getTitle());
	driver.navigate().to("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("sushanthi1304@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("kanni.sush2");
	driver.findElement(By.name("login")).click();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.quit();
	

	


				
		
		
}

}
