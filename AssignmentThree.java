package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssignmentThree {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://zero.webappsecurity.com/");

		System.out.println("****Launched the browser****");

		driver.manage().window().maximize();

		driver.findElement(By.id("signin_button")).click();

		System.out.println("Clicked sigin button");

		driver.findElement(By.cssSelector("input#user_login")).sendKeys("username");

		driver.findElement(By.xpath("//input[contains(@name, 'user_password')]")).sendKeys("password");

		driver.findElement(By.name("submit")).click();

		System.out.println("Signed in");

		driver.findElement(By.id("details-button")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();

		driver.findElement(By.linkText("Pay Bills")).click();

		driver.findElement(By.linkText("Purchase Foreign Currency")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("purchase_cash")).click();
		

		Alert alert = driver.switchTo().alert();

		String text = alert.getText();
		System.out.println(text);
		
		Assert.assertEquals(text,"Please, ensure that you have filled all the required fields with valid values.","Alert text is not matching");

		alert.accept();

		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]")).click();
		
		driver.findElement(By.cssSelector("a#logout_link")).click();
		
		System.out.println("Logged out");

		System.out.println("***Run Successful***");
		driver.close();

		driver.quit();



	}

}
