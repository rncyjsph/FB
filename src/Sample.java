import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Rincy\\Rincy\\Program\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String actitle = driver.getTitle();
		System.out.println(actitle);
		//WebElement logo=driver.findElement(By.xpath("//a[@class='nav-logo-link']"));
		//JavascriptExecutor js=((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", logo);
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.getElementById('text-4').style.borderColor = 'Red'");
		//js.executeScript("document.getElementById('//a[@class='nav-logo-link']').style.borderColor = 'Red'");
		//Actions action=new Actions(driver);
		//action.moveToElement(driver.findElement(By.xpath("//a[@class='nav-logo-link']"))).perform();
		WebElement dropbox=driver.findElement(By.id("searchDropdownBox"));
		Select sel=new Select(dropbox);
		sel.selectByVisibleText("Books");
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("data catalog");
		
		driver.findElement(By.xpath("//input[@type='submit' and @class='nav-input']")).click();
		
	driver.findElement(By.xpath("//div[@class='block sky desktopSparkle__contentContainer']//div[1]//div[1]//div[1]//a[1]//div[1]/div[1]//img[1]")).click();
		
	driver.findElement(By.xpath("//span[@id='pdagDesktopSparkleDescription1']")).getText();
	
	System.out.println(driver.findElement(By.xpath("//span[@class='a-size-large mediaTab_title'][contains(text(),'Kindle')]")));
		
	System.out.println(driver.findElement(By.xpath("//span[@class='a-size-large mediaTab_title'][contains(text(),'Paperback')]")));
		
	System.out.println(driver.findElement(By.xpath("//span[contains(text(),'$8.09 - $20.48')]")));
	
	System.out.println(driver.findElement(By.xpath("//span[contains(text(),'$15.38')]")));
	
		
	}

}
