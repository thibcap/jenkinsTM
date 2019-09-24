package org.autom3.miniprojet.jenkins;

import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;

import org.autom3.miniprojet.jenkins.Outils;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class testTM {

	WebDriver driver;
	String b = "firefox";
	
	private String BROWSER=System.getProperty("browser");
	
	
	@After
		public void tearDown(){
			System.out.println("\n@After");
			driver.close();
		}
		
		
		@Test
		
		public void test() throws InterruptedException, FileNotFoundException{
			
			driver= Outils.choisirNavigateur(BROWSER);
			driver.manage().window().maximize();
			driver.get("http://192.168.102.149:10005/squash/login");
			driver.findElement(By.xpath("//input[@id='username']")).clear();
			Thread.sleep(200);
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
			Thread.sleep(200);
			driver.findElement(By.xpath("//input[@id='password']")).clear();
			Thread.sleep(200);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin");
			Thread.sleep(200);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//a[@id='test-case-link']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[@href='#'])[1]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-plusthick']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//a[text()='Nouveau cas de test...']")).click();
			Thread.sleep(200);
			driver.findElement(By.xpath("//input[@id='add-test-case-name']")).clear();
			Thread.sleep(200);
			driver.findElement(By.xpath("//input[@id='add-test-case-name']")).sendKeys("CDT1");
			Thread.sleep(200);
			driver.findElement(By.xpath("//input[@id='add-test-case-reference']")).clear();
			Thread.sleep(200);
			driver.findElement(By.xpath("//input[@id='add-test-case-reference']")).sendKeys("REF1");
			Thread.sleep(500);
			driver.findElement(By.xpath("(//input[@type='button' and @value='Ajouter'])[2]")).click();
			Thread.sleep(500);
			assertTrue(driver.findElement(By.xpath("//a[text()='REF1 - CDT1']")).isDisplayed());
			Thread.sleep(200);
			driver.findElement(By.xpath("//a[@class='jstree-clicked ui-state-default']")).click();
			Thread.sleep(200);
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-trash']")).click();
			Thread.sleep(200);
			driver.findElement(By.xpath("//input[@id='del-node-confirm-btn']")).click();
			
			
			
			
	
	
}
}