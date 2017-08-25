import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigatePages
{

	public static void main(String[] args) 
	{
		
		WebDriver driver = new FirefoxDriver();
 
		String appUrl = "https://www.valtech.com/";
		driver.get(appUrl);

		//Question 1 Is News Displayed
		
		If (driver.findElement(By.xpath("//*[@id="container"]/div[2]/div[3]/div[1]/header/h2")).isDisplayed())
		{
		System.out.println("Element is Visible");
		
		}
		else
		{
			System.out.println("Element is InVisible");
		}



		//About
		driver.findElement(By.xpath("//*[@id="navigationMenuWrapper"]/div/ul/li[1]/a/span")).click();


		If (driver.findElement(By.xpath("//*[@id="container"]/div[1]/h1")).isDisplayed())
		{
		System.out.println("Element is Visible");
		
		}
		else
		{
			System.out.println("Element is InVisible");
		}
 
		driver.navigate().back();
		
		//Services

		driver.findElement(By.xpath("//*[@id="navigationMenuWrapper"]/div/ul/li[3]/a/span")).click();

		If (driver.findElement(By.xpath("//*[@id="container"]/section/header/h1")).isDisplayed())
		{
		System.out.println("Element is Visible");
		
		}
		else
		{
			System.out.println("Element is InVisible");
		}

 
		driver.navigate().back();


		//Work

		driver.findElement(By.xpath("//*[@id="navigationMenuWrapper"]/div/ul/li[2]/a/span")).click();

		If (driver.findElement(By.xpath("//*[@id="container"]/header/h1")).isDisplayed())
		{
		System.out.println("Element is Visible");
		
		}
		else
		{
			System.out.println("Element is InVisible");
		}


		//Contact US Question 3

		driver.findElement(By.xpath("//*[@id="contacticon"]/div/div/div[1]/i")).click();
	
		
 
		driver.navigate().back();

		
 
		driver.close();
	}
}
