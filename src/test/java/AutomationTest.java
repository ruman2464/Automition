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
	@Test
	public void signup()
	{
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div/div[1]/div/div/div[2]/h1")).click();
	}
	

}
