package org.axes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazondemo {
	public static void main(String[] args) {
		System.out.println("java");
		WebDriverManager.chromedriver().setup();
		   WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
	}

	
	}
	
