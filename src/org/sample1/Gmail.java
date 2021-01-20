package org.sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jb\\selinium\\Launch\\driver\\chromedriver.exe");
	WebDriver drive=new ChromeDriver();
	drive.get("http://gmail.com/");
	}

}
