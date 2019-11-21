import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\Rincy\\Rincy\\Program\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String etitle = "Facebook - Log In or Sign Up";
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String actitle = driver.getTitle();
		System.out.println(actitle);
		System.out.println(etitle);
//compare the actual title with the expected title
		if (etitle.equals(actitle)) {
			System.out.println("Hello World -Test Passed");
		} else {
			System.out.println("Hello World -Test Failed");
		}

		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("pass")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.quit();
	}

}
