package com.bitu.P;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args) {
//	System.setProperty("webdriver.chrome.driver", "//path");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	String title = driver.getTitle();
	System.out.println(title);
	//driver.close();
}
}
