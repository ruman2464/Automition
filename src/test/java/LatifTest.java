import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LatifTest 
{
	FirefoxDriver driver=new FirefoxDriver();
	void add()
{
	//This is new file
	//Hello,how are you?
	// hi
	// 
}

	@Before
	public void open()
	{
		driver.get("http://www.facebook.com");
	}
	
	@After
	public void close() throws InterruptedException
	
	{	Thread.sleep(9000);
		driver.close();
	}
	
	@Test
	public void signIn()
	{
		driver.findElement(By.id("email")).sendKeys("latif1675@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("latif1234");
		driver.findElement(By.id("u_0_e")).click();
	}


}
