import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HamidTest 

{
FirefoxDriver browser = new FirefoxDriver();

	@Before
	public void  openBrowser()
	{
		browser.get("http://www.facebook");
	}
	@After
	public void end()
	{
		browser.quit();
	}
	@Test
	public void sigin()
	{
		browser.findElement(By.id("email")).sendKeys("islam.md1971@gmail.com");
		browser.findElement(By.id("pass")).sendKeys("asfeaurthy01");
		browser.findElement(By.id("u_0_e")).click();
	}

}
