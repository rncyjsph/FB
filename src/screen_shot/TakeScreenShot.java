package screen_shot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException {
		
			
				
				WebDriver driver=new ChromeDriver();
				System.setProperty("webdriver.chrome.driver",
						"E:\\Rincy\\Rincy\\Program\\chromedriver_win32\\chromedriver.exe");
				driver.get("http://www.google.com");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
				File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				//copy to desired file location
				
			FileUtils.copyFile(src, new File("E:\\Rincy\\Rincy\\workspace\\com.self.automationpractice\\src\\main\\java\\screen_shot\\google.png"));
	}

		


	}


