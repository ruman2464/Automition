//<<<<<<< HEAD
  import org.junit.Before;
//=======
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
//>>>>>>> f8626ced01f20ba8221ec86bd72e3347d9f75c54


public class BimalTest 
{
	FirefoxDriver driver = new FirefoxDriver();
	//Thanks Everybody
	
	@Before
	public void openBrowser()
	{
		driver.get("http://www.facebook.com");
	}
	@After
	public void end() throws Exception
	{
		Thread.sleep(5000);
		driver.quit();
	}
	@Test
	public void login()
	{
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("xyz567");
		driver.findElement(By.id("u_0_c")).click();
		
	}
	@Test
	public void signUp()
	{
		
	}
	
}
