package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic  {

	public static void main(String[] args) throws IllegalStateException, InterruptedException {
		// TODO Auto-generated method stub
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		  /* driver.get("https://www.amazon.in/");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
		   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus8t");
		   Thread.sleep(2000);
		   driver.findElement(By.id("nav-search-submit-button")).click();*/
		   driver.get("https://login.yahoo.com/");
		   driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("abc@yahoo.com");
		   driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		   String PageTitle = driver.getTitle();
		   //Thread.sleep(2000);

		    System.out.println("PAge Title is" +PageTitle);

		    driver.close();

	}

}
