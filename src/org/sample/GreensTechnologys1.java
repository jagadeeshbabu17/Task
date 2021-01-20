package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GreensTechnologys1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\jb\\selinium\\Launch\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http:\\greenstech.in/selenium-course-content.html");
		
	}

}
