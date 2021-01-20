package org.sample2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Greens {
	public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver","C:\\Users\\jb\\selinium\\Launch\\driver\\IEDriverServer.exe");
	WebDriver driver =new InternetExplorerDriver();
    driver.get("http://www.greenstechnologys.com/");
}
}