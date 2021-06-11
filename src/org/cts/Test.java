package org.cts;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
public static void main(String[] args) throws AWTException,IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\eclipse-workspace\\sel2\\driver2\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
   d.get("https://www.flipkart.com/");
   d.manage().window().maximize();
   d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
   WebElement btnFashion = d.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[4]"));
   Actions a=new Actions(d);
   a.moveToElement(btnFashion).perform();
   WebElement btnwomens = d.findElement(By.xpath("(//a[@class='_6WOcW9 _2-k99T'])"));
   a.moveToElement(btnwomens).perform();
   TakesScreenshot ts=(TakesScreenshot)d;
   File src=ts.getScreenshotAs(OutputType.FILE);
   File dest=new File("d:\\filpcart.png");
   FileUtils.copyFile(src,dest);
   
}
}
