package org.sys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\NewD3\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("Nishath");
		WebElement Password = driver.findElement(By.name("pass"));
		Password.sendKeys("nishath");
		String url = driver.getCurrentUrl();
		System.out.println(url);


	}
}
