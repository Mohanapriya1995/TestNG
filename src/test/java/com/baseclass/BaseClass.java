package com.baseclass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver=null;
	public static void browserLaunch() {
		driver=new ChromeDriver();
		driver.get(prop_reuse("url"));
		driver.manage().window().maximize();			
	}
	public static void input_Data(WebElement element, String data) {
		try {
			element.sendKeys(data);
		}catch (TimeoutException e) {
			
		} catch(NoSuchElementException e) {
			throw new RuntimeException("Unable to enter the Data");
		}
	}
	public static void click_value(WebElement element) {
		try {
			element.click();
		}catch (TimeoutException e) {
			
		} catch(NoSuchElementException e) {
			throw new RuntimeException("Unable to enter the Data");
		}
		
	}
	public static String prop_reuse(String data) {
		String value = null;

		try {
			FileReader read = new FileReader("C:\\Users\\ravir\\eclipse-workspace\\NewCucumber\\target\\config.properties");
			Properties prop = new Properties();
			prop.load(read);
			value = prop.getProperty(data);
			System.out.println(value);
		

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
	
	

}
