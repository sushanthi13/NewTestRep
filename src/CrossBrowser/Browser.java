package CrossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameters;

public class Browser {
	WebDriver driver;
	
	
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			  driver=new ChromeDriver();

		}
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@Test
	public void parameters()
	{
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus8t");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
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
