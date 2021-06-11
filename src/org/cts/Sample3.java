package org.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\eclipse-workspace\\selenium3\\driver3\\chromedriver.exe");
		
		WebDriver d2=new ChromeDriver();
		d2.get("https://www.swiggy.com/");
		d2.manage().window().maximize();
		
		String title=d2.getTitle();
		System.out.println(title);
		String currentUrl = d2.getCurrentUrl();
		System.out.println(currentUrl);
		
		//d2.close();
		WebElement txt=d2.findElement(By.name("location"));
		txt.sendKeys("chennai");
		
		//WebElement txt1=d2.findElement(By.id("pass"));
		//txt1.sendKeys("1234567");
	
	}

}

