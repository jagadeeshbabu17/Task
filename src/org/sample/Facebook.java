package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\jb\\selinium\\Launch\\driver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https://www.facebook.com/");

	}

}
