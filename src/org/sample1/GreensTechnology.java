package org.sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnology {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jb\\selinium\\Launch\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
	}
}
