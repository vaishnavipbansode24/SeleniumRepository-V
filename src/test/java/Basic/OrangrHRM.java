package Basic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangrHRM {

	public static void main(String[] args) throws IOException, InterruptedException {
		OrangeLogin ol=new OrangeLogin();
		String username=ol.Login("username");
		String password=ol.Login("password");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		Thread.sleep(1000);//
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
