package mobilePhones;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_PARA_001Test {
	
	@Parameters("skill")
	@Test
	public static void parameterisation(@Optional("https://www.qspiders.com/")  String url){
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		Reporter.log("Browser is launched Successfully");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Reporter.log("Browser is maximized successfully");
		driver.get(url);
		driver.quit();
		
	}
	

}
