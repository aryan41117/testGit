package com.java;



import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class bikes {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Yashu\\OneDrive\\Desktop\\SELENIUM\\Selemium Setup Files\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get(("https://www.zigwheels.com/"));
		 
		 
		 
		 driver.findElement(By.xpath("//*[@id=\"headerNewNavWrap\"]/div[2]/ul/li[5]/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"popularCityList\"]/li[8]/a")).click();
		 
		List<WebElement>links = driver.findElements(By.xpath("//label[contains(@for,'bycarid')]"));
		
		System.out.println("Number of links"+links.size());
		
		for(WebElement link:links)
		{
			System.out.println(link.getText());
		}
		 
			driver.quit();
	}

}
