package org.autom3.miniprojet.jenkins;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Outils {

//	public static void renseignerChamp(WebElement we, String s) {
//		we.clear();
//		we.sendKeys(s);
//	}
//	
//	public static void verificationTextWebElement(String expected, WebElement we) {
//		try{
//			assertEquals(expected, we.getText());
//		}
//		catch(Error e) {
//			System.out.println("[FAIL] verificationTextWebElement \n expected : "+expected+"\n real="+ we.getText());
//			throw e;
//		}
//	}
//	
	
//	
//	public static void selectOptionFromMenu(WebElement menu,String option) {
//		Select select = new Select(menu);
//		select.selectByValue(option);
//	}
//	
//	
	
	public static WebDriver choisirNavigateur(String browser) {
		switch (browser) {
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "src/main/resources/driver/geckodriver.exe");
			return new FirefoxDriver();
			
		case "ie":
			System.setProperty("webdriver.ie.driver", "src/main/resources/driver/IEDriverServer.exe");
			return new InternetExplorerDriver();
			

		case "chrome":
			System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
			return new ChromeDriver();
			

		default:
			System.out.println("browser mal renseigné");
			return null;
		}
	}
	
	
}
