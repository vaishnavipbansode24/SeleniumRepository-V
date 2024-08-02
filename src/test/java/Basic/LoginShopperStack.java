package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginShopperStack extends ShopUtility{

	public static void main(String[] args) throws IOException, InterruptedException {
		ShopUtility s=new ShopUtility();
		String email=s.LogD("email");
		String password=s.LogD("password");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(500));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='loginBtn']"))).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		;
		
	}

}
