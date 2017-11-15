package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class First {
	WebDriver driver;
	
  @Test
  public void Login() {
	  driver.get("http://qa.express.intellocut.com/users/sign_in");
	  driver.findElement(By.id("user_email")).sendKeys("anmol@threadsol.com");
	  driver.findElement(By.id("user_password")).sendKeys("123456");
	  driver.findElement(By.xpath(".//*[@id='new_user']/input[3]")).click();
	  driver.findElement(By.xpath(".//*[@id='side-menu']/li[3]/a")).click();
  }
  
  @Test
  public void Settings() {
	  driver.findElement(By.xpath(".//*[@id='side-menu']/li[5]/a")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver 5");
	  driver=new ChromeDriver();
	  
	   }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
