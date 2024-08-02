package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFunction {

	public static void main(String[] args) throws IOException, InterruptedException {
//		Properties prop=new Properties();
//		FileInputStream file=new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\com.crm.advancedseleniumA6\\configurefile\\loginfunction.properties");
//		prop.load(file);
//		String email=prop.getProperty("email");
//		System.out.println(email);
//		String password = prop.getProperty("password");
		JavaUtility jv=new JavaUtility();
	      String email=jv.loginData("email");
	      String password=jv.loginData("password");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("email")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}

}
