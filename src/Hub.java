import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Hub {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"E:\\Rincy\\Rincy\\Program\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://wallethub.com/profile/test-insurance-company-13732055i");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[contains(text(),'Write a Review')]")).click();
		// Write Review

		driver.findElement(By.xpath("//textarea[@class='textarea wrev-user-input validate']")).sendKeys(
				"The app is  very interesting .Automation testing is a Software testing technique to test and compare the actual outcome with the expected outcome. This can be achieved by writing test scripts or using any automation testing tool. Test automation is used to automate repetitive tasks and other testing tasks which are difficult to perform manually");

		// Selection of drop down value
		driver.findElement(By.xpath("//span[text()='Select...']")).click();
		driver.findElement(By.xpath("//li[text() = 'Health Insurance']")).click();

		// Select the Rating star
		Actions action = new Actions(driver);
		WebElement star = driver.findElement(By.cssSelector("write-review .rvs-star-svg:nth-child(4) path"));
		star.click();
		
		// Click on Submit button
		
		driver.findElement(By.xpath("//div[@class='sbn-action semi-bold-font btn fixed-w-c tall']")).click();
		driver.close();
	}

}
