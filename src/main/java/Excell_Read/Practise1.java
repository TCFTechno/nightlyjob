package Excell_Read;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practise1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/");
		
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		
		WebElement findElement = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));

		findElement.click();
		

		WebElement findElement1 = driver.findElement(By.xpath("//span[text()='Alerts']"));
		findElement1.click();
		
		WebElement findElement2 = driver.findElement(By.xpath("//button[@id='alertButton']"));
		findElement2.click();
		
		
		
		
		driver.switchTo().alert().accept();
		
		
		System.out.println("ok");
		
	}
}
