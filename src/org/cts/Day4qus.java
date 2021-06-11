package org.cts;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day4qus {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\eclipse-workspace\\sel2\\driver2\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
		   d.get("https://www.flipkart.com/");
		   d.manage().window().maximize();
		   d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		   Actions a=new Actions(d);
		  WebElement txtbaby = d.findElement(By.xpath("(//img[@class='_396cs4  _3exPp9'])[9]"));
		  a.moveToElement(txtbaby).perform();
		   
		   
		   
		   
		   
		   // WebElement txtelectronics = d.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[5]"));
		   //a.moveToElement(txtelectronics).perform();
		   
		   
		   
		   
		   
		   
		   
		   
		   //WebElement txtsearch = d.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		   //txtsearch.sendKeys("mobiles");
		   //WebElement btnmobile = d.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[3]"));
		   //btnmobile.click();
}
}