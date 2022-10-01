import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Booking {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\aykurdi\\Desktop\\old data D\\backup-aya\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://www.booking.com/");
				
				JavascriptExecutor j = (JavascriptExecutor) driver;
			    j.executeScript("window.scrollBy(0,500)");
				
				driver.findElement(
					  By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[1]/div[2]"))
				      .click();
				
				driver.findElement(
					  By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[1]/td[7]"))
				      .click();
				
			   driver.findElement(
					 By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[3]/td[2]"))
			         .click();
				
			   driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button"))
			         .click();
				
				
			   String error = driver.findElement(By.xpath("//*[@id=\"destination__error\"]/div")).getText();
				
			   System.out.println(error);
			   
			   Assert.assertTrue(error.contains("Enter a destination to start searching."));
			 
			  
					
					
	
				
				
	}

}
