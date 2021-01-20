package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\jb\\selinium\\Launch\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		System.out.println("12345");
		System.out.println("kkkk");System.out.println("12345");
		System.out.println("kkkk");
		
	}
}
