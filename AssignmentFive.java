package seleniumBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.naukri.com/");

		driver.manage().window().maximize();

		System.out.println("Browser Launched"); 
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='GOT IT']")).click();

		System.out.println("Handled cookies pop-up");

		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		String currentWindow = driver.getTitle();
		System.out.println("Current Window tile: "+ currentWindow);

		driver.findElement(By.xpath("//img[contains(@src,'/cognizant-hs-tp-21sep2018.gif')]")).click();


		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		List<String> windowHandleList = new ArrayList<>(windowHandles);


		driver.switchTo().window(windowHandleList.get(1));
		System.out.println("Second window title: "+driver.getTitle());		

		driver.switchTo().defaultContent();

		driver.close();
		
		driver.quit();	
		
		System.out.println("***Run Successful***");
	}
	
	

}