import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AutomationTest 
{
FirefoxDriver driver = new FirefoxDriver();
	
	@Before
	public void start()
	{
		driver.get("http://www.facebook.com");
	}
	
	@After
	public void end()
	{
		driver.quit();
	}
	
	@Test
	public void login()
	{
		driver.findElement(By.id("email")).sendKeys("qachithi@gmail.com");
	}
	

}
