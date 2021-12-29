package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTwo {

	public static void main(String[] args) throws InterruptedException {


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

		driver.findElement(By.partialLinkText("New Payee")).click();

		Thread.sleep(1000);

		driver.findElement(By.cssSelector("input#np_new_payee_name")).sendKeys("test");

		driver.findElement(By.tagName("textarea")).sendKeys("test");

		driver.findElement(By.xpath("//input[@name='account']")).sendKeys("202020");	

		driver.findElement(By.name("details")).sendKeys("test");

		driver.findElement(By.id("add_new_payee")).click();

		System.out.println("Filled the details");

		driver.close();

		driver.quit();

		System.out.println("*****Run Successful*****");





	}

}
